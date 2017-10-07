package com.xingguang.system.user.service.impl;

import com.xingguang.exception.CustomException;
import com.xingguang.system.role.entity.custom.SysRoleEntityCustom;
import com.xingguang.system.user.domain.SysUserDomain;
import com.xingguang.system.user.entity.SysUserEntity;
import com.xingguang.system.user.entity.custom.SysUserEntityCustom;
import com.xingguang.system.user.mapper.SysUserMapper;
import com.xingguang.system.user.service.ISysUserService;
import com.xingguang.utils.MD5Utils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2017/9/22.
 */
@Service
public class SysUserServiceImpl implements ISysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUserEntityCustom findSysUserById(Long userId) throws Exception {
        return sysUserMapper.findSysUserById(userId);
    }


    @Override
    public SysUserEntity findSysUserByLoginId(String loginId) throws Exception {
        return sysUserMapper.findSysUserByLoginId(loginId);
    }

    @Override
    public List<SysUserEntityCustom> findSysUserList(String userName) throws Exception {
        SysUserEntity sysUserEntity = new SysUserEntity();
        sysUserEntity.setUserName(userName);
        return sysUserMapper.findSysUserList(sysUserEntity);
    }

    @Override
    public SysUserEntity updateSysUserById(SysUserDomain domain) throws Exception {
        SysUserEntity entity = new SysUserEntity();
        BeanUtils.copyProperties(domain,entity);
        entity.setUpdateTime(new Date());
        sysUserMapper.updateSysUserById(entity);
        return entity;
    }

    @Override
    public SysUserEntity addSysUser(SysUserDomain sysUserDomain) throws CustomException {
        SysUserEntity entity = null;
        try {
            // step 1 : 检查系统是否已存在loginId
            entity = this.findSysUserByLoginId(sysUserDomain.getLoginId());
            if(entity != null){
                throw new CustomException("系统已存在相同登陆账户！");
            }
            // step 2: 保存用户信息
            entity = new SysUserEntityCustom();
            BeanUtils.copyProperties(sysUserDomain,entity);
            entity.setPassword(MD5Utils.getMd5ofStr(sysUserDomain.getPassword(),sysUserDomain.getLoginId()));
            entity.setCreateTime(new Date());

            sysUserMapper.insertSysUser(entity);
        } catch (Exception e) {
            e.printStackTrace();
            throw new CustomException(e.getMessage());
        }
        return entity;
    }

    @Override
    public List<SysUserEntityCustom> findSysUserRoles(String userName) throws Exception {
        SysUserEntity sysUserEntity = new SysUserEntity();
        sysUserEntity.setUserName(userName);
        return sysUserMapper.findSysUserRoles(sysUserEntity);
    }

    @Override
    public List<SysRoleEntityCustom> findSysUserHaveRoles(Long userId) throws Exception {
        return sysUserMapper.findSysUserHaveRoles(userId);
    }
}
