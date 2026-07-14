package com.demo.consumer.restclient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor//@AllAgrConstructor and @NoArgContructor
public class ProviderRestClient {

    /*The Object for RestClient comes from global configuration(RestClientConfig)*/
    private final RestClient restClient;

    /*Creating methods for all URL here if the Provider may hav more than one URL*/
    public String getInstanceInfo(){
        return restClient.get()
                .uri("/instance-info")
                .retrieve()
                .body(String.class);
    }

    /*===============Create it directly in the class - NOT RECOMMENTED=============================*/
//    private final RestClient restClient = RestClient.builder()
//            .baseUrl("http://localhost:8081")
//            .build();
//
//    public String getInstanceInfo() {
//        return restClient.get()
//                .uri("/instance-info")
//                .retrieve()
//                .body(String.class);
//    }
}
