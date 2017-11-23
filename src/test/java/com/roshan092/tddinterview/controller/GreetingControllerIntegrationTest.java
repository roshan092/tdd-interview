package com.roshan092.tddinterview.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetingControllerIntegrationTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void shouldFetchGreeting() throws Exception {
        //language=JSON
        String expectedJson = "{\n" +
                "  \"name\": \"ROSHAN LOBO\",\n" +
                "  \"message\": \"Good Morning\"\n" +
                "}";
        ResponseEntity<String> responseEntity = testRestTemplate.getForEntity("/hello", String.class);
        JSONAssert.assertEquals(expectedJson, responseEntity.getBody(), true);
    }
}