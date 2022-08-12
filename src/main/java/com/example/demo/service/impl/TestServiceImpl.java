package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

@Service
//@Component("aServiceImpl") 名字取得符合规则就会自动首字母小写，反之就得自己指定名字
public class TestServiceImpl extends CommonServiceImpl {
    @Override
    public String add(String code) {
        return "-------------test-code=" + code;
    }
}


