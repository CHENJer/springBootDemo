package com.springboot.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
public class DemoApplication {

    public static void main(String[] args) {
        /*不关闭banner*/
        SpringApplication.run(DemoApplication.class, args);
        /*关闭banner*/
       /* SpringApplicationBuilder builder = new SpringApplicationBuilder(DemoApplication.class);
        builder.bannerMode(Banner.Mode.OFF).run(args);*/
    }

}
