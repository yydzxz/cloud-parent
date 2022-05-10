package io.github.yyd.cloud.organizationservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan("io.github.yyd.cloud.organizationservice.mapper")
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class OrganizationserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrganizationserviceApplication.class, args);
    }

}
