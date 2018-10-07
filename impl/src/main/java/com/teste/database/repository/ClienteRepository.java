package com.teste.database.repository;

import com.teste.database.model.Cliente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClienteRepository extends ReactiveMongoRepository<Cliente, String> {
    Mono<Cliente> findById(String id);
    Flux<Cliente> findAll();
}
