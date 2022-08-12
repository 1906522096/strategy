package com.example.demo.service;

import com.example.demo.service.impl.CommonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Objects;

@Component
public class ServiceFactory {

    @Autowired
    private Map<String, CommonServiceImpl> serviceMap;

    /**
     * 根据编码获取service
     *
     * @param code 编码
     * @return service
     */
    public CommonServiceImpl getService(String code) {
        if (Objects.isNull(serviceMap.get(code))) {
            throw new RuntimeException("没有获取到service");
        }
        return serviceMap.get(code);
    }
}
