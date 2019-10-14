package com.jiakai.gitjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zws
 * @Date: 2019-10-10 17:03
 */
@RestController
@RequestMapping(path="/test")
public class JenkinsTsetController {

    /**
     * 测试
     * @return
     */
    @GetMapping("/testjenkins")
    public String testjenkins() {
        return "hello 傻傻 jenkins!";
    }

    /**
     * 测试2
     * @return
     */
    @GetMapping("/testjtow")
    public String testjtow() {
        return "hello销量!";
    }



}
