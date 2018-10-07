package com.teste.contract.v1.facade;

import com.teste.contract.v1.mapper.ClienteMapper;
import com.teste.contract.v1.model.request.ClienteRequest;
import com.teste.contract.v1.model.response.ClienteResponse;
import com.teste.facade.ClienteFacade;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ClienteContractFacade {

    private ClienteFacade facade;

    public Mono<ClienteResponse> salvarCliente(ClienteRequest request) {
        return facade.salvarCliente(ClienteMapper.mapperToModel(request))
                .map(ClienteMapper::mapperToContract);
    }

    public Mono<ClienteResponse> buscarClientePorId(String id) {
        return facade.buscarClientePorId(id)
                .map(ClienteMapper::mapperToContract);
    }

    public Flux<ClienteResponse> buscarTodosClientes() {
        return facade.buscarTodosClientes()
                .map(ClienteMapper::mapperToContract);
    }

    public Mono<ResponseEntity<ClienteResponse>> atualizarLimiteCliente(String id, ClienteRequest request) {
        return facade.atualizarLimiteCliente(id, ClienteMapper.mapperToModel(request))
                .map(ClienteMapper::mapperToContract)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    public Mono<ResponseEntity<ClienteResponse>> atualizarRiscoCliente(String id, ClienteRequest request) {
        return facade.atualizarRiscoCliente(id, ClienteMapper.mapperToModel(request))
                .map(ClienteMapper::mapperToContract)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    public Mono<ResponseEntity<Void>> deletarCliente(String id) {
        return facade.deletarCliente(id);
    }
}
