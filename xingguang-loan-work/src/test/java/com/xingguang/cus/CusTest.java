package com.xingguang.cus;

import com.xingguang.work.cus.entity.CusUserInfoEntity;
import com.xingguang.work.cus.service.ICusUserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by admin on 2017/10/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CusTest {

    @Autowired
    private ICusUserInfoService cusUserInfoService;

    @Test
    public void testFindCusListByWorkUserId() throws Exception{
        List<CusUserInfoEntity> list = cusUserInfoService.findCusListByWorkUserId(8L);
        System.out.println(list);
    }
}
