package com.springboot.demo.service;

import com.springboot.demo.model.SysUser;

import java.util.List;

public interface IndexService {

    int deleteByPrimaryKey(Long id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long id);

    List<SysUser> selectAllUser();

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}
