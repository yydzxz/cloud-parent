package io.github.yyd.cloud.licensingservice.manager.organization;

import io.github.yyd.cloud.licensingservice.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yangyidian
 * @date 2022/05/09
 **/
@FeignClient(value = "organizationservice", contextId = "organizationserviceHello", path = "/hello")
public interface HelloManager {

    @GetMapping("/hi")
    User hi(@SpringQueryMap User user);
}
