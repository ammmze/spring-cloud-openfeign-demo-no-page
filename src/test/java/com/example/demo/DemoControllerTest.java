package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT, properties = "server.port=48563")
public class DemoControllerTest {
    @Autowired
    StringClient client;

    @Test
    public void testClient() {
        Page<String> page = client.getStrings(PageRequest.of(0, 10));
        assertThat(page.getContent().get(0)).isEqualTo("foo");
    }
}
