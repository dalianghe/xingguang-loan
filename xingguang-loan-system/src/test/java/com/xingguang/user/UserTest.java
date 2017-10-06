package com.xingguang.user;

import com.xingguang.system.user.domain.SysUserDomain;
import com.xingguang.system.user.entity.custom.SysUserEntityCustom;
import com.xingguang.system.user.service.ISysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2017/10/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    private ISysUserService sysUserService;

    @Test
    public void testFindUserById() throws Exception{
        SysUserEntityCustom custom = sysUserService.findSysUserById(1L);
        System.out.println(custom.toString());
    }

    @Test
    public void testFindUserList() throws Exception{
        List<SysUserEntityCustom> list = sysUserService.findSysUserList("");
        System.out.println(list);
    }

    @Test
    public void testUpdateUserById() throws Exception{
        SysUserDomain domain = new SysUserDomain();
        domain.setId(2L);
        domain.setUserName("猪八戒");
        domain.setUserBirthday(new Date());
        domain.setJoinDate(new Date());
        sysUserService.updateSysUserById(domain);
    }

    @Test
    public void testFindUsersRoles() throws Exception{
        List<SysUserEntityCustom> list = sysUserService.findSysUserRoles("");
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getRoles().size());
        }
    }
}
