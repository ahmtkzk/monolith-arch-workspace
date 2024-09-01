package com.ahmtkzk.monolitharch.client;

import com.ahmtkzk.monolitharch.model.placeholder.PlaceholderPostResponseEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "placeholder-api", url = "https://jsonplaceholder.typicode.com")
public interface PlaceholderClient {

    @GetMapping("/posts/{id}")
    PlaceholderPostResponseEntity getPostById(@PathVariable int id);

}
