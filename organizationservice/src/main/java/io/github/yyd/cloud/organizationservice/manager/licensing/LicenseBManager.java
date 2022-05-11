package io.github.yyd.cloud.organizationservice.manager.licensing;

import io.github.yyd.cloud.organizationservice.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author yangyidian
 * @date 2022/05/11
 **/
@FeignClient(value = "licensingservice", contextId = "licensingserviceB", path = "/b")
public interface LicenseBManager {
    @GetMapping("/b")
    public User b(@SpringQueryMap User user);


    @PostMapping("/b1")
    public User b1(@RequestBody User user);
}
