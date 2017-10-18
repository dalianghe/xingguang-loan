package com.xingguang.credit;

import com.xingguang.credit.info.entity.CreditInfoEntity;
import com.xingguang.credit.info.entity.custom.CreditInfoEntityCustom;
import com.xingguang.credit.info.service.ICreditInfoService;
import com.xingguang.credit.mng.domain.CreditDomain;
import com.xingguang.credit.mng.service.ICreditService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/13  16:38
 * @Version v1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CreditInfoTest {

    @Autowired
    private ICreditInfoService service;
    @Autowired
    private ICreditService creditService;

    @Test
    public void testFind() throws Exception{
        CreditInfoEntityCustom entityCustom = service.findCreditInfoByCusId(1L);
        System.out.println(entityCustom.getFinalAmount());
    }

    @Test
    public void testinsert() throws Exception{
        CreditInfoEntity entity = new CreditInfoEntity();
        entity.setCusUserId(2L);
        entity.setFinalAmount(new BigDecimal(20000));
        entity.setUnusedAmount(new BigDecimal(10000));
        entity.setUsedAmount(new BigDecimal(10000));
        entity.setCreditTime(new Date());
        entity.setId(1L);
        service.insertCreditInfo(entity);
    }

    @Test
    public void testUpdate() throws Exception{
        CreditInfoEntity entity = new CreditInfoEntity();
        entity.setFinalAmount(new BigDecimal(30000));
        entity.setCreditTime(new Date());
        entity.setCusUserId(2L);
        service.updateCusCreditInfo(entity);
    }

    @Test
    public void testCreditFindAll() throws Exception{
        CreditDomain domain = new CreditDomain();
        domain.setName("何大亮");
        Map<String,Integer> pager = new HashMap<>();
        pager.put("page",1);
        pager.put("pageSize",2);
        domain.setPager(pager);
        Map<String ,Object> map = creditService.findCreditList(domain);
        System.out.println(map.size());
    }
}
