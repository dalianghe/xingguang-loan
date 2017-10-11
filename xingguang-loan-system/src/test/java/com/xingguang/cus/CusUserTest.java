package com.xingguang.cus;

import com.xingguang.cus.baseinfo.domain.CusUserDomain;
import com.xingguang.cus.baseinfo.service.ICusUserInfoService;
import com.xingguang.cus.linkinfo.entity.CusUserLinkEntity;
import com.xingguang.cus.linkinfo.service.ICusUserLinkService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2017/10/11.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CusUserTest {

    @Autowired
    private ICusUserInfoService service;
    @Autowired
    private ICusUserLinkService linkService;

    @Test
    public void testFindAll() throws Exception{
        Map<String,Integer> pager = new HashMap<>();
        pager.put("page",1);
        pager.put("pageSize",10);
        CusUserDomain domain = new CusUserDomain();
        domain.setName(null);
        domain.setPager(pager);
        Map<String ,Object> map = service.findCusUserAll(domain);
        System.out.println(map.get("total"));
    }

    @Test
    public void testFindCusUserLinkByUserId() throws Exception{
        CusUserLinkEntity entity = linkService.findCusUserLinkByUserId(2L);
        System.out.println(entity.getLinkName());
    }
}
