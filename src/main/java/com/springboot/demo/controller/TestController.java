package com.springboot.demo.controller;

import com.springboot.demo.model.TestDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test")
public class TestController {
  @Autowired
  private TestDemo testDemo;
    @RequestMapping(value = "getProperties", method = RequestMethod.GET)
    public String getProperties() {
       String properties = "----------------"+testDemo.toString()+"-------------";
        return properties;
    }

}
