package com.example.demo.enums;

import lombok.Getter;

@Getter
public enum ServiceEnum {

    A("a", "aServiceImpl", "A的service"),
    B("b", "bServiceImpl", "B的service"),
    C("c", "cServiceImpl", "C的service"),
    TEST("test", "cServiceImpl", "C的service");

    /**
     * 编码
     */
    private final String code;
    /**
     * service名称
     */
    private final String service;
    /**
     * 描述
     */
    private final String desc;

    ServiceEnum(String code, String service, String desc) {
        this.code = code;
        this.service = service;
        this.desc = desc;
    }

    /**
     * 根据编码查询service名称
     *
     * @param code 编码
     * @return service名称
     */
    public static String getServiceByCode(String code) {
        for (ServiceEnum serviceEnum : ServiceEnum.values()) {
            if (code.equals(serviceEnum.getCode())) {
                return serviceEnum.getService();
            }
        }
        throw new RuntimeException("未获取到服务");
    }
}

