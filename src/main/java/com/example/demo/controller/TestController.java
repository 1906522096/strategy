package com.example.demo.controller;

import com.example.demo.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test")

public class TestController {

    @Qualifier("commonServiceImpl")
    @Autowired
    private CommonService commonService;


    @GetMapping("/{code}")
    public String one(@PathVariable String code) {
        return commonService.add(code);
    }

    @RequestMapping("/test/b")
    @ResponseBody
    public String hello() {
        return "hello";
    }
}
