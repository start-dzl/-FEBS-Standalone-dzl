package com.dengzl;

import cc.mrbird.febs.common.security.starter.annotation.EnableFebsCloudResourceServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@EnableFebsCloudResourceServer
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class FebsStandaloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(FebsStandaloneApplication.class, args);
    }
}
