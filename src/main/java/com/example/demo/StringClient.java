package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "strings", url = "http://localhost:${server.port:8080}/")
public interface StringClient {
    @GetMapping("/api")
    Page<String> getStrings(Pageable pageable);
}
