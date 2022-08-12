package com.example.demo.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component("aServiceImpl")
public class AServiceImpl extends CommonServiceImpl {

    public String add(String code) {
        return "-------------Acode=" + code;
    }
}
