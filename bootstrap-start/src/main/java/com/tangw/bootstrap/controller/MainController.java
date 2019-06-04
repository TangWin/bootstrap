package com.tangw.bootstrap.controller;

import com.tangw.bootstrap.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 健康检查
 *
 * @author tangw
 * @date 2019/6/3
 **/
@RestController
@RequestMapping(value = "")
public class MainController {

    private final MainService mainService;

    @Autowired
    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/check")
    public String checkState() {
        return "hello world!";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return mainService.sayHello();
    }
}
