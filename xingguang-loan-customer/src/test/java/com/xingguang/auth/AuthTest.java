package com.xingguang.auth;

import com.xingguang.customer.auth.entity.CusUserAuthEntity;
import com.xingguang.customer.auth.params.AuthBean;
import com.xingguang.customer.auth.service.ICusUserAuthService;
import com.xingguang.customer.info.entity.CusUserInfo;
import com.xingguang.customer.info.service.ICusUserInfoService;
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
    private ICusUserAuthService cusUserAuthService;
    @Autowired
    private ICusUserInfoService cusUserInfoService;

    @Test
    public void testAddCusUserAuth() throws Exception{
        AuthBean authBean = new AuthBean();
        authBean.setPhone("13611201362");
        CusUserAuthEntity entity = cusUserAuthService.addCusUserAuth(authBean);
        System.out.println(entity.toString());
    }

    @Test
    public void testAddCusUserInfo() throws Exception{
        CusUserInfo cusUserInfo = new CusUserInfo();
        cusUserInfo.setPhone("13611201362");
        cusUserInfoService.create(cusUserInfo);
    }

    @Test
    public void testRegisterCusUser() throws Exception{
        AuthBean authBean = new AuthBean();
        authBean.setPhone("13611201362");
        CusUserInfo entity = cusUserAuthService.registerCusUser(authBean);
        System.out.println(entity.toString());
    }

}
