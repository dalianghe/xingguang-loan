package com.xingguang.resource;

import com.xingguang.system.resource.domain.ResourceDomain;
import com.xingguang.system.resource.entity.SysResourceEntity;
import com.xingguang.system.resource.entity.custom.SysResourceEntityCustom;
import com.xingguang.system.resource.service.ISysResourceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by admin on 2017/10/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ResouceTest {

    @Autowired
    private ISysResourceService sysResourceService;

    @Test
    public void testFindResourceAll() throws Exception{
        //List<SysResourceEntityCustom> list = sysResourceService.findResourceAll(null);
        //System.out.println(list.size());
    }

    @Test
    public void testAddResource() throws Exception{
        ResourceDomain domain = new ResourceDomain();
        domain.setResName("测试");
        domain.setResType("permission");
        SysResourceEntity entity = sysResourceService.addResource(domain);
        System.out.println(entity.toString());
    }
}
