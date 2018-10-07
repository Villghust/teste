package com.teste.contract.v1;

import com.teste.contract.v1.facade.ClienteContractFacade;
import com.teste.contract.v1.model.request.ClienteRequest;
import com.teste.contract.v1.model.response.ClienteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("v1")
public class RestEndpoint {

    @Autowired
    private ClienteContractFacade clienteContractFacade;

    @PostMapping("/clientes")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<ClienteResponse> salvarCliente(@RequestBody ClienteRequest request) {
        return clienteContractFacade.salvarCliente(request);
    }

    @GetMapping("/clientes/{id}")
    public Mono<ClienteResponse> buscarClientePorId(@PathVariable String id) {
        return clienteContractFacade.buscarClientePorId(id);
    }

    @GetMapping("/clientes")
    public Flux<ClienteResponse> buscarTodosClientes() {
        return clienteContractFacade.buscarTodosClientes();
    }

    @PatchMapping("/clientes/limites/{id}")
    public Mono<ResponseEntity<ClienteResponse>> atualizarLimiteCliente(@PathVariable String id,
                                                                        @RequestBody ClienteRequest request) {
        return clienteContractFacade.atualizarLimiteCliente(id, request);
    }

    @PatchMapping("/clientes/risco/{id}")
    public Mono<ResponseEntity<ClienteResponse>> atualizarRiscoCliente(@PathVariable String id,
                                                                        @RequestBody ClienteRequest request) {
        return clienteContractFacade.atualizarRiscoCliente(id, request);
    }

    @DeleteMapping("/clientes/{id}")
    public Mono<ResponseEntity<Void>> deletarCliente(@PathVariable String id) {
        return clienteContractFacade.deletarCliente(id);
    }
}
