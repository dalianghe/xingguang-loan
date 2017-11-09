package com.xingguang.job.cell;

import com.alibaba.fastjson.JSONObject;
import com.xingguang.job.cell.entity.SysInterfaceLog;
import com.xingguang.job.cell.service.ICellService;
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

}
