package com.example.demo.service.impl;

import com.example.demo.enums.ServiceEnum;
import com.example.demo.service.CommonService;
import com.example.demo.service.ServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    private ServiceFactory serviceFactory;


    @Override
    public String add(String code) {
        String service = ServiceEnum.getServiceByCode(code);
        return serviceFactory.getService(service).add(code);
    }


}
