package com.xingguang.userrole;

import com.xingguang.system.userrole.service.ISysUserRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2017/10/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRoleTest {

    @Autowired
    private ISysUserRoleService service ;

    @Test
    public void testInsert() throws Exception{
        List<Long> roles = new ArrayList<>();
        roles.add(2L);
        roles.add(3L);
        service.insertUserRole(5L,roles);
    }

    @Test
    public void testDelete() throws Exception{
        service.deleteUserRoleByUserId(5L);
    }
}
