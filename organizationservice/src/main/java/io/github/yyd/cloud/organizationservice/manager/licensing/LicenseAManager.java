package io.github.yyd.cloud.organizationservice.manager.licensing;

import io.github.yyd.cloud.organizationservice.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author yangyidian
 * @date 2022/05/11
 **/
@FeignClient(value = "licensingservice", contextId = "licensingserviceA", path = "/a")
public interface LicenseAManager {

    @PostMapping("/a1")
    User a1(@RequestBody User user);
}
