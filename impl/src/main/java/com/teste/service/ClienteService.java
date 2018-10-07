package com.teste.service;

import com.teste.database.model.Cliente;
import com.teste.database.repository.ClienteRepository;
import com.teste.mapper.ClienteModelMapper;
import com.teste.model.ClienteModel;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@AllArgsConstructor
public class ClienteService {

    private ClienteRepository repository;

    public Mono<ClienteModel> salvarCliente(Cliente cliente) {
        return repository.insert(cliente)
                .map(ClienteModelMapper::clienteToClienteModel);
    }

    public Mono<ClienteModel> buscarClientePorId(String id) {
        return repository.findById(id)
                .map(ClienteModelMapper::clienteToClienteModel);
    }

    public Flux<ClienteModel> buscarTodosClientes() {
        return repository.findAll()
                .map(ClienteModelMapper::clienteToClienteModel);
    }

    public Mono<ClienteModel> atualizarLimiteCliente(String id, Cliente cliente) {
        return repository.findById(id)
                .flatMap(antigo -> {
                    Cliente novo = new Cliente(antigo.getId(),
                            antigo.getNome(),
                            cliente.getLimiteCredito(),
                            antigo.getRisco());
                    repository.delete(antigo);
                    return repository.save(novo);
                })
                .map(ClienteModelMapper::clienteToClienteModel);
    }

    public Mono<ClienteModel> atualizarRiscoCliente(String id, Cliente cliente) {
        return repository.findById(id)
                .flatMap(antigo -> {
                    Cliente novo = new Cliente(antigo.getId(),
                            antigo.getNome(),
                            antigo.getLimiteCredito(),
                            cliente.getRisco());
                    repository.delete(antigo);
                    return repository.save(novo);
                })
                .map(ClienteModelMapper::clienteToClienteModel);
    }

    public Mono<ResponseEntity<Void>> deletarCliente(String id) {
        return repository.findById(id)
                .flatMap(cliente -> repository.delete(cliente)
                        .then(Mono.just(ResponseEntity.ok().<Void>build()))
                )
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}
