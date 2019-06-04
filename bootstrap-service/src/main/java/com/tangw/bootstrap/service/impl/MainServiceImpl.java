package com.tangw.bootstrap.service.impl;

import com.tangw.bootstrap.service.MainService;
import org.springframework.stereotype.Service;

/**
 * @author tangw
 * @date 2019/6/4
 **/
@Service
public class MainServiceImpl implements MainService {
    @Override
    public String sayHello() {
        return "hello world!";
    }
}
