package com.vit.Myfirstspringbootapi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class configEmployee {
    @Bean
    public RestTemplate getRestTemplate(@Value("${petapi.url}")String baseurl){
        return new RestTemplateBuilder().rootUri(baseurl).build();

    }
}


