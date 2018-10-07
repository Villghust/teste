package com.teste.contract.v1.facade;

import com.teste.facade.ClienteFacade;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FacadeContractConfiguration {

    @Bean
    public ClienteContractFacade clienteContractFacade(ClienteFacade facade) {
        return new ClienteContractFacade(facade);
    }
}
