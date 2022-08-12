package com.example.demo.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("cServiceImpl")
public class CServiceImpl extends CommonServiceImpl {
    @Override
    public String add(String code) {
        return "-------------Ccode=" + code;
    }
}
