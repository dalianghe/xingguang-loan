package com.xingguang.config;

import com.xingguang.system.login.domain.AuthUserDomain;
import com.xingguang.system.resource.entity.SysResourceEntity;
import com.xingguang.system.resource.service.ISysResourceService;
import com.xingguang.system.user.entity.SysUserEntity;
import com.xingguang.system.user.service.ISysUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 自定义Realm，完成自定义认证策略
 * @Author hedaliang
 * @Date 2017/9/21  11:02
 * @Version v1.0.0
 */
public class ShiroRealm extends AuthorizingRealm {

    @Autowired
    private ISysUserService sysUserService;
    @Autowired
    private ISysResourceService sysResourceService;

    /**
     * 身份认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken)
            throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String loginId = token.getUsername();
        AuthUserDomain authUserDomain = new AuthUserDomain();
        SysUserEntity sysUserEntity = null;
        try {
            // 从数据库中查询用户
            sysUserEntity = sysUserService.findUserByLoginId(loginId);

            if(sysUserEntity != null){ // 用户存在
                BeanUtils.copyProperties(sysUserEntity,authUserDomain);
                // 获取用户权限菜单
               // List<SysResourceEntity> menus = sysResourceService.findMenusByUserId(sysUserEntity.getId());
                //authUserDomain.setMenus(menus);
                ByteSource salt = ByteSource.Util.bytes(loginId);
                return new SimpleAuthenticationInfo(authUserDomain, sysUserEntity.getPassword(),salt, getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 权限认证
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        // 从principalCollection中获取认证的身份信息
        AuthUserDomain authUserDomain = (AuthUserDomain)principalCollection.getPrimaryPrincipal();
        // 根据身份信息获取数据中用户的权限信息
        // TODO

        List<String> permissions = new ArrayList<String>();
        permissions.add("user:list");
        //
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addStringPermissions(permissions);
        return simpleAuthorizationInfo;
    }


}
