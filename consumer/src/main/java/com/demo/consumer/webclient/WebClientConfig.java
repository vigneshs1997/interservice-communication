package com.demo.consumer.webclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
   /*If we do not,Error: required a bean of type
    'org.springframework.web.reactive.function.client.WebClient$Builder'
     that could not be found.*/
   @Bean
   public WebClient.Builder restClientBuilder() {
      return WebClient.builder();
   }

   /*Generating WebClient bean(object) for accessing globally instead of creating class manually
      and store it the Spring IoC container and can be injected anywhere in the application*/
   @Bean
   public WebClient webClient(WebClient.Builder builder){
      return builder.baseUrl("http://localhost:8081")
              .build();
   }
}
