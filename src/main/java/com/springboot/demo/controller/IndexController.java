package com.springboot.demo.controller;

import com.springboot.demo.mapper.SysUserMapper;
import com.springboot.demo.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "chenjie")
public class IndexController {

    @Autowired
    private SysUserMapper sysUserMapper;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String showUser(Model model) {

        List<SysUser> sysUsers = sysUserMapper.selectAllUser();
        model.addAttribute("sysUsers", sysUsers);

        return "index";
    }

}
