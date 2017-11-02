package com.xingguang.finance;

import com.xingguang.finance.repy.domain.RepyDomain;
import com.xingguang.finance.repy.service.IRepymtApplyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by admin on 2017/11/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RepymtApplyTest {

    @Autowired
    private IRepymtApplyService service;

    @Test
    public void testInsert() throws Exception{
        Long[] ids = {23L};
        RepyDomain domain = new RepyDomain();
        domain.setRepymtType(10);
        domain.setOperatorId(1L);
        domain.setOperatorName("测试");
        domain.setIds(ids);
        service.repaymentNormal(domain);
    }

}
