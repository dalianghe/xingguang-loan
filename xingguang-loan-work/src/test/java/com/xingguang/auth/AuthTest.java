package com.xingguang.auth;

import com.xingguang.work.auth.entity.WorkUserAuthEntity;
import com.xingguang.work.auth.params.AuthBean;
import com.xingguang.work.auth.service.IWorkUserAuthService;
import com.xingguang.work.info.entity.WorkUserInfoEntity;
import com.xingguang.work.info.params.InfoBean;
import com.xingguang.work.info.service.IWorkUserInfoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by admin on 2017/10/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthTest {

    @Autowired
    private IWorkUserAuthService workUserAuthService;
    @Autowired
    private IWorkUserInfoService workUserInfoService;

    @Test
    public void testAddWorkUserAuthService() throws Exception{
        AuthBean authBean = new AuthBean();
        authBean.setPhone("13901234567");
        WorkUserAuthEntity entity = workUserAuthService.addWorkUserAuth(authBean);
        System.out.println(entity.toString());
    }

    @Test
    public void testAddWorkUserInfoService() throws Exception{
        InfoBean infoBean = new InfoBean();
        infoBean.setPhone("13901234567");
        WorkUserInfoEntity entity = workUserInfoService.addWorkUserInfo(infoBean);
        System.out.println(entity.toString());
    }

    @Test
    public void testRegisterWorkUserService() throws Exception{
        AuthBean authBean = new AuthBean();
        authBean.setPhone("13611201362");
        WorkUserAuthEntity entity = workUserAuthService.registerWorkUser(authBean);
        System.out.println(entity.toString());
    }

}
