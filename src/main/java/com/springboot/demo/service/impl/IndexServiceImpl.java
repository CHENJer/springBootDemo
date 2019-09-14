package com.springboot.demo.service.impl;

import com.springboot.demo.mapper.SysUserMapper;
import com.springboot.demo.model.SysUser;
import com.springboot.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return 0;
    }

    @Override
    public int insert(SysUser record) {
        return 0;
    }

    @Override
    public int insertSelective(SysUser record) {
        return 0;
    }

    @Override
    public SysUser selectByPrimaryKey(Long id) {
        return null;
    }

    @Override
    public List<SysUser> selectAllUser() {
        List<SysUser> sysUsers = sysUserMapper.selectAllUser();
        return sysUsers;
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(SysUser record) {
        return 0;
    }
}
