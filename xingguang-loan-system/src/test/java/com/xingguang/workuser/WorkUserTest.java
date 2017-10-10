package com.xingguang.workuser;

import com.xingguang.work.baseinfo.domain.WorkUserDomain;
import com.xingguang.work.baseinfo.service.IWorkUserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

/**
 * @Description 用一句话描述该文件做什么
 * @Author hedaliang
 * @Date 2017/10/10  15:14
 * @Version v1.0.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkUserTest {

    @Autowired
    private IWorkUserInfoService service;

    @Test
    public void testFindWorkUserAll() throws Exception{
        WorkUserDomain domain = new WorkUserDomain();
        domain.setName("和");
        Map<String , Object> map = service.findWorkUserAll(domain);
        System.out.println(map.size());
    }
}
