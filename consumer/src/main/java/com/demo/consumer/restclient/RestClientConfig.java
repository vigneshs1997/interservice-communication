package com.demo.consumer.restclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {
    /*==============================Constructor Injection================================*/

    /*Generating RestClient.Builder bean(object) for accessing globally instead of creating class manually
      ,store it the Spring IoC container and can be injected anywhere in the application*/
    @Bean
    public RestClient.Builder restClientBuilder() {
        return RestClient.builder();
    }

    /*Generating RestClient bean(object) for accessing globally instead of creating class manually
      and store it the Spring IoC container and can be injected anywhere in the application*/
    @Bean
    public RestClient restClient(RestClient.Builder builder){//builder = RestClient.builder()
        return builder.baseUrl("http://localhost:8081")
                .build();
    }

    /*==============================Field Injection(@Autowired)================================*/
//    @Autowired
//    private RestClient.Builder builder;
//
//    @Bean
//    public RestClient restClient() {
//        return builder
//                .baseUrl("http://localhost:8081")
//                .build();
//    }
}
