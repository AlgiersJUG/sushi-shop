package org.jug.algeria.sushi.controller;

import org.fest.assertions.Assertions;
import org.jug.algeria.sushi.SushiApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {SushiApplication.class})
@WebIntegrationTest("server.port:9000")
public class SushiControllerTest {

    RestTemplate restTemplate = new RestTemplate();

    @Test
    public void sushiControllerShouldSay_HelloThere_WhenInvokedOnExpectedContextURI(){
        final ResponseEntity<String> entity = restTemplate.getForEntity("http://localhost:9000/api/hello", String.class);
        Assertions.assertThat(entity).isNotNull();
        Assertions.assertThat(entity.getBody()).isNotNull().isEqualTo("Hello There !");
    }
}
