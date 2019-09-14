package com.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class LoginController {

    // 发送post请求，代替了RequestMapping（value="/user/login", method="post"）
    @PostMapping(value = "/")
    // 对登录请求判断request的参数值，并存放在map中
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map) {
        // 我们判断，如果登录名不是空，并且，密码是 123456 就登录成功（暂不涉及数据库）
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            // 登录成功，就跳转到下一个页面
            return "dashboard";
        } else {
            // 登录失败，刷新本登录页
            map.put("msg", "用户名密码错误");
            return "login";
        }
    }

}
