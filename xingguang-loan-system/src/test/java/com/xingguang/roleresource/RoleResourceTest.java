package com.xingguang.roleresource;

import com.xingguang.system.roleresource.service.ISysRoleResouceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/10/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleResourceTest {

    @Autowired
    private ISysRoleResouceService sysRoleResouceService;

    @Test
    public void testDelete() throws Exception{
        sysRoleResouceService.deleteRoleResourceByRoleId(2L);
    }

    @Test
    public void testInsert() throws Exception{
        List<Long> res = new ArrayList<>();
        res.add(14L);
        res.add(15L);
        res.add(16L);
        sysRoleResouceService.insertRoleResource(2L,res);
    }

}
