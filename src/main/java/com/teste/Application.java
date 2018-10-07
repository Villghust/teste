package com.teste;

import com.teste.database.model.Cliente;
import com.teste.database.repository.ClienteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner base(ClienteRepository repository) {return args -> {

        Flux<Cliente> clientesIniciais = Flux.just(
                new Cliente(null,"Márcio Santos do Carmo", 10000.0, "A"),
                new Cliente(null,"João Henrique de Sousa", 3500.0, "B"),
                new Cliente(null,"Tereza dos Santos do Carmo",1500.0,"C"))
                .flatMap(repository::save);

        clientesIniciais.thenMany(repository.findAll())
                .subscribe(System.out::println);};
    }
}
