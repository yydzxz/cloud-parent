package io.github.yyd.cloud.licensingservice.manager.organization;

import io.github.yyd.cloud.licensingservice.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author yangyidian
 * @date 2022/05/11
 **/
@FeignClient(value = "organizationservice", contextId = "organizationserviceA", path = "/a")
public interface OrgAMananger {

    @GetMapping("/a")
    public User a(@SpringQueryMap User user);


    @PostMapping("/a1")
    public User a1(@RequestBody User user);
}
