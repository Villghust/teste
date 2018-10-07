package com.teste.service;

import com.teste.database.repository.ClienteRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    public ClienteService clienteService(ClienteRepository repository) {
        return new ClienteService(repository);
    }
}
