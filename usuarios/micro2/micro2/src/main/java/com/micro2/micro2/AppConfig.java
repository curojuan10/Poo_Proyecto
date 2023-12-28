package com.micro2.micro2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    @Bean("clienteRest")
    RestTemplate registrarRestTemplate(){
        return  new RestTemplate();
    }
    
}
