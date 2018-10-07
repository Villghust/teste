package com.teste.facade;

import com.teste.service.ClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FacadeConfiguration {

    @Bean
    public ClienteFacade clienteFacade(ClienteService service) {
        return new ClienteFacade(service);
    }
}
