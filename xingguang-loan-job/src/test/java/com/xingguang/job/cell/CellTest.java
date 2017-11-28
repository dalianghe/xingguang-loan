package com.xingguang.job.cell;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.xingguang.job.cell.entity.SysInterfaceLog;
import com.xingguang.job.cell.service.ICellService;
import com.xingguang.utils.cell.entity.JxlApplicatinoCheckEntity;
import com.xingguang.utils.cell.entity.JxlApplicationCheckCellPhoneEntity;
import com.xingguang.utils.cell.entity.JxlApplicationCheckIdCardEntity;
import com.xingguang.utils.cell.entity.JxlApplicationCheckUsernameEntity;
import com.xingguang.utils.cell.mapper.JxlApplicationCheckCellPhoneMapper;
import com.xingguang.utils.cell.mapper.JxlApplicationCheckIdCardMapper;
import com.xingguang.utils.cell.mapper.JxlApplicationCheckUsernameMapper;
import com.xingguang.utils.cell.service.IJxlApplicationCheckService;
import com.xingguang.utils.cell.service.IJxlBehaviorCheckService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/11/9  11:27
 * @Version v1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CellTest {

    @Autowired
    private ICellService cellService;
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private IJxlApplicationCheckService checkService;
    @Autowired
    private JxlApplicationCheckUsernameMapper jxlApplicationCheckUsernameMapper;
    @Autowired
    private JxlApplicationCheckIdCardMapper jxlApplicationCheckIdCardMapper;
    @Autowired
    private JxlApplicationCheckCellPhoneMapper jxlApplicationCheckCellPhoneMapper;
    @Autowired
    private IJxlApplicationCheckService service;
    @Autowired
    private IJxlBehaviorCheckService behaviorCheckService;

    @Test
    public void testList() throws Exception{
        List<SysInterfaceLog> list = cellService.findTodoReportList();
        System.out.println(list.size());
    }

    @Test
    public void testGetAccessRreportToken() throws Exception{
        String url = "https://www.juxinli.com/api/v2/access_report_token?client_secret={clientSecret}&hours" +
                "={hours}&org_name={orgName}";
        Map<String,Object> userMap = new HashMap<>();
        userMap.put("clientSecret","1b9617b05de443749cd147a308d3c58b");
        userMap.put("hours","per");
        userMap.put("orgName","xingguangqianbao");

        String result = restTemplate.getForObject(url, String.class, userMap);
        Map<String,Object> map = JSONObject.parseObject(result , Map.class);
        Integer aa = (Integer)map.get("code");
        if(aa==200){
            System.out.println("------------");
        }
        System.out.println(result);
    }

    @Test
    public void testGetReportData() throws Exception{
        String dataUrl = "https://www.juxinli.com/api/access_report_data?access_token={accessToken}&client_secret={clientSecret}&name={name}&phone={phone}&idcard={idCard}";
        String result = null;
        Map<String,Object> userMap = new HashMap<>();
        userMap.put("clientSecret","1b9617b05de443749cd147a308d3c58b");
        userMap.put("accessToken","c9782ea405d04d93b2e31fbd0ba3e0ad");
        userMap.put("name","孙荐");
        userMap.put("idCard","130821198704271513");
        userMap.put("phone","18101096010");
        String jsonStr = restTemplate.getForObject(dataUrl, String.class, userMap);
        JSONObject object = JSON.parseObject(jsonStr);
        checkService.deleteApplicationCheckByRptId(60L);
        if(object.getString("success").equals("true")){
            JSONObject jxlReport = JSON.parseObject(jsonStr);
            JSONObject reportData = JSON.parseObject(jxlReport.getString("report_data"));
            JSONArray array = reportData.getJSONArray("application_check");
            service.addApplicationCheck(60L,47L,array);
            List<JxlApplicatinoCheckEntity> list1 = new ArrayList<>();
            for(int i=0;i<array.size();i++)/*{
                JxlApplicatinoCheckEntity checkEntity = new JxlApplicatinoCheckEntity();
                Object obj = array.get(i);
                JSONObject aa = JSON.parseObject(obj.toString());
                String appPoint = aa.getString("app_point");
                checkEntity.setRptId(60L);
                checkEntity.setAppPoint(appPoint);
                if("user_name".equals(appPoint)){
                    JxlApplicationCheckUsernameEntity usernameEntity = new JxlApplicationCheckUsernameEntity();
                    usernameEntity.setRptId(60L);
                    JSONObject ab = JSON.parseObject(aa.getString("check_points"));
                    usernameEntity.setKeyValue(ab.getString("key_value"));
                    jxlApplicationCheckUsernameMapper.deleteCheckUsernameByRptId(60L);
                    jxlApplicationCheckUsernameMapper.insertCheckUsername(usernameEntity);
                }else if("id_card".equals(appPoint)){
                    JxlApplicationCheckIdCardEntity idCardEntity = new JxlApplicationCheckIdCardEntity();
                    idCardEntity.setRptId(60L);
                    JSONObject ab = JSON.parseObject(aa.getString("check_points"));
                    idCardEntity.setKeyValue(ab.getString("key_value"));
                    idCardEntity.setGender(ab.getString("gender"));
                    idCardEntity.setAge(ab.getString("age"));
                    idCardEntity.setProvince(ab.getString("province"));
                    idCardEntity.setCity(ab.getString("city"));
                    idCardEntity.setRegion(ab.getString("region"));
                    jxlApplicationCheckIdCardMapper.deleteCheckIdCardByRptId(60L);
                    jxlApplicationCheckIdCardMapper.insertCheckIdCard(idCardEntity);
                }else if("cell_phone".equals(appPoint)){
                    JxlApplicationCheckCellPhoneEntity checkCellPhoneEntity = new JxlApplicationCheckCellPhoneEntity();
                    checkCellPhoneEntity.setRptId(60L);
                    JSONObject ab = JSON.parseObject(aa.getString("check_points"));
                    checkCellPhoneEntity.setKeyValue(ab.getString("key_value"));
                    checkCellPhoneEntity.setWebsite(ab.getString("website"));
                    checkCellPhoneEntity.setReliability(ab.getString("reliability"));
                    checkCellPhoneEntity.setRegTime(ab.getString("reg_time"));
                    checkCellPhoneEntity.setCheckName(ab.getString("check_name"));
                    checkCellPhoneEntity.setCheckIdcard(ab.getString("check_idcard"));
                    checkCellPhoneEntity.setCheckEbusiness(ab.getString("check_ebusiness"));
                    jxlApplicationCheckCellPhoneMapper.deleteCheckCellPhoneByRptId(60L);
                    jxlApplicationCheckCellPhoneMapper.insertCheckCellPhone(checkCellPhoneEntity);
                }
                list1.add(checkEntity);
            }*/

            if(list1!=null){
                //checkService.insertApplicationCheck(list1);
            }

        }
    }

    @Test
    public void testBehaviorCheck() throws Exception {
        String dataUrl = "https://www.juxinli.com/api/access_report_data?access_token={accessToken}&client_secret={clientSecret}&name={name}&phone={phone}&idcard={idCard}";
        String result = null;
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("clientSecret", "1b9617b05de443749cd147a308d3c58b");
        userMap.put("accessToken", "c9782ea405d04d93b2e31fbd0ba3e0ad");
        userMap.put("name", "孙荐");
        userMap.put("idCard", "130821198704271513");
        userMap.put("phone", "18101096010");
        String jsonStr = restTemplate.getForObject(dataUrl, String.class, userMap);
        JSONObject object = JSON.parseObject(jsonStr);
        JSONObject reportData = JSON.parseObject(object.getString("report_data"));
        String behaviorCheck = reportData.getString("behavior_check");

        behaviorCheckService.addBehaviorCheck(60L,47L,behaviorCheck);
        System.out.println(behaviorCheck);
    }

}
