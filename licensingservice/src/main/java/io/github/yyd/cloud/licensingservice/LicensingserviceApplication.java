package io.github.yyd.cloud.licensingservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableFeignClients
@RefreshScope
@MapperScan("io.github.yyd.cloud.licensingservice.mapper")
@SpringBootApplication
public class LicensingserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LicensingserviceApplication.class, args);
    }

}
