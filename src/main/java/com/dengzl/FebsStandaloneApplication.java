package com.dengzl;

import cc.mrbird.febs.common.security.starter.annotation.EnableFebsCloudResourceServer;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableFebsCloudResourceServer
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.dengzl.mapper")
public class FebsStandaloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(FebsStandaloneApplication.class, args);
    }
}
