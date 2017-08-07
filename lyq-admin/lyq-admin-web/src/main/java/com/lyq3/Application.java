package com.lyq3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ImportResource("classpath:dubbo-consum.xml")
@EnableSwagger2
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
