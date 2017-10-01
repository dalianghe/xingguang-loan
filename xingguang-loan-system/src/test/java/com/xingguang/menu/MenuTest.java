package com.xingguang.menu;

import com.xingguang.system.resource.entity.custom.SysResourceEntityCustom;
import com.xingguang.system.resource.service.ISysResourceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by admin on 2017/10/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MenuTest {

    @Autowired
    private ISysResourceService sysResourceService;

    @Test
    public void testService() throws Exception{
        List<SysResourceEntityCustom> list = sysResourceService.findMenusByUserId(1);
        System.out.println(list.size());
    }

}
