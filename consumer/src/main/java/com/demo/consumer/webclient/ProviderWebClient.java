package com.demo.consumer.webclient;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ProviderWebClient {

    private final WebClient webClient;

    /*Creating methods for all URL here if the Provider may hav more than one URL*/
    public Mono<String>  getInstanceInfo(){
        return webClient.get()
                .uri("/instance-info")
                .retrieve()
                .bodyToMono(String.class);
    }
}
