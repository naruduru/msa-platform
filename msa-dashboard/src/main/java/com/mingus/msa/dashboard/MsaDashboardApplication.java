package com.mingus.msa.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MsaDashboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsaDashboardApplication.class, args);
    }
}
