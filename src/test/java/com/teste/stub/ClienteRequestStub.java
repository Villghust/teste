package com.teste.stub;

import com.teste.contract.v1.model.request.ClienteRequest;
import com.teste.enumeration.RiscoEnum;

public class ClienteRequestStub {

    public static ClienteRequest clienteRequestStub() {
        return ClienteRequest.builder()
                .nome("Márcio Santos do Carmo")
                .limiteCredito(123456.0)
                .risco(RiscoEnum.TIPO_A.getTipo())
                .build();
    }

    public static ClienteRequest clienteRequestSemNome() {
        return ClienteRequest.builder()
                .nome(null)
                .limiteCredito(123456.0)
                .risco(RiscoEnum.TIPO_A.getTipo())
                .build();
    }

    public static ClienteRequest clienteRequestSemLimiteCredito() {
        return ClienteRequest.builder()
                .nome("Márcio Santos do Carmo")
                .limiteCredito(null)
                .risco(RiscoEnum.TIPO_A.getTipo())
                .build();
    }

    public static ClienteRequest clienteRequestSemRisco() {
        return ClienteRequest.builder()
                .nome("Márcio Santos do Carmo")
                .limiteCredito(123456.0)
                .risco(null)
                .build();
    }

    public static ClienteRequest clienteRequestVazio() {
        return ClienteRequest.builder()
                .nome(null)
                .limiteCredito(null)
                .risco(null)
                .build();
    }
}
