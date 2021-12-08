package com.danya.spring.rest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.danya.spring.rest")
public class MyConfig {

    @Bean
    public RestTemplate restTemplate(){ // бин для http request
        return new RestTemplate();
    }

}
