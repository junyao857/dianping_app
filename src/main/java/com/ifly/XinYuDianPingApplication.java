package com.ifly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ifly.mapper")
@SpringBootApplication
public class XinYuDianPingApplication {
    public static void main(String[] args) {
        SpringApplication.run(XinYuDianPingApplication.class, args);
    }
}
