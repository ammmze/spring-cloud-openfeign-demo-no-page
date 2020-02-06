package com.example.demo;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

import java.util.Collections;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping(value = "/api", produces = APPLICATION_JSON_UTF8_VALUE)
    public Page<String> getStrings(Pageable pageable) {
        return new PageImpl<>(Collections.singletonList("foo"), pageable, 1);
    }
}
