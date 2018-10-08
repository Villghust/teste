package com.teste.facade;

import com.teste.mappers.ClienteModelMapper;
import com.teste.model.ClienteModel;
import com.teste.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ClienteFacade {

    private ClienteService service;

    public Mono<ClienteModel> salvarCliente(ClienteModel model) {
        return service.salvarCliente(ClienteModelMapper.clienteModelToCliente(model));
    }

    public Mono<ClienteModel> buscarClientePorId(String id) {
        return service.buscarClientePorId(id);
    }

    public Flux<ClienteModel> buscarTodosClientes() {
        return service.buscarTodosClientes();
    }

    public Mono<ClienteModel> atualizarLimiteCliente(String id, ClienteModel model) {
        return service.atualizarLimiteCliente(id, ClienteModelMapper.clienteModelToCliente(model));
    }

    public Mono<ClienteModel> atualizarRiscoCliente(String id, ClienteModel model) {
        return service.atualizarRiscoCliente(id, ClienteModelMapper.clienteModelToCliente(model));
    }

    public Mono<ResponseEntity<Void>> deletarCliente(String id) {
        return service.deletarCliente(id);
    }
}
