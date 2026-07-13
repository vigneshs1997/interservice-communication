package com.demo.consumer.resttemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.restclient.RestTemplateBuilder;

@Configuration
public class RestTemplateConfig {
    @Bean//Create RestTemplate Bean(Object) is created once and we reuse it in entire application
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}