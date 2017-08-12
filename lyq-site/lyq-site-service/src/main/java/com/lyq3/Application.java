package com.lyq3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:dubbo-produc.xml")
@MapperScan(basePackages ="com.lyq3.mapper")
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
