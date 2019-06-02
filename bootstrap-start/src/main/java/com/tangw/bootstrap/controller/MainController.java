package com.tangw.bootstrap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 健康检查
 * @author tangw
 * @date 2019/6/3
 **/
@RestController
@RequestMapping(value = "")
public class MainController {

    @GetMapping("/check")
    public String checkState() {
        return "hello world!";
    }


}
