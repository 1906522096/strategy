package com.example.demo.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("bServiceImpl")
public class BServiceImpl extends CommonServiceImpl {
    @Override
    public String add(String code) {
        return "-------------Bcode=" + code;
    }
}
