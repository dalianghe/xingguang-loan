package com.xingguang.role;

import com.xingguang.system.role.domain.RoleDomain;
import com.xingguang.system.role.entity.SysRoleEntity;
import com.xingguang.system.role.entity.custom.SysRoleEntityCustom;
import com.xingguang.system.role.service.ISysRoleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by admin on 2017/10/6.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleTest {

    @Autowired
    private ISysRoleService sysRoleService;

    @Test
    public void testFindSysRoleList() throws Exception{
        List<SysRoleEntityCustom> list = sysRoleService.findSysRoleList("管理");
        System.out.println(list.size());
    }

    @Test
    public void testUpdateSysRole() throws Exception{
        RoleDomain roleDomain = new RoleDomain();
        roleDomain.setId(5L);
        /*roleDomain.setRoleCode("SHRY");
        roleDomain.setRoleName("审核人员");
        roleDomain.setRoleType("BIZ");*/
        roleDomain.setStatus("0");
        sysRoleService.updateSysRole(roleDomain);
    }

    @Test
    public void testAddSysRole() throws Exception{
        RoleDomain roleDomain = new RoleDomain();
        roleDomain.setRoleCode("SHRY");
        roleDomain.setRoleName("审核人员");
        roleDomain.setRoleType("BIZ");
        roleDomain.setDeleteFlag("1");
        SysRoleEntity entity = sysRoleService.addSysRole(roleDomain);
    }

    @Test
    public void testFindSysRoleResources() throws Exception{
        List<SysRoleEntityCustom> list = sysRoleService.findSysRoleResources("管理");
        System.out.println(list.size());
    }
}
