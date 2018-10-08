package com.teste.stub;

import com.teste.contract.v1.model.response.ClienteResponse;
import com.teste.enumeration.RiscoEnum;

public class ClienteResponseStub {

    public static ClienteResponse clienteResponseStub() {
        return ClienteResponse.builder()
                .nome("Márcio Santos do Carmo")
                .limiteCredito(123456.0)
                .risco(RiscoEnum.TIPO_A.getTipo())
                .build();
    }

    public static ClienteResponse clienteResponseSemNome() {
        return ClienteResponse.builder()
                .nome(null)
                .limiteCredito(123456.0)
                .risco(RiscoEnum.TIPO_A.getTipo())
                .build();
    }

    public static ClienteResponse clienteResponseSemLimiteCredito() {
        return ClienteResponse.builder()
                .nome("Márcio Santos do Carmo")
                .limiteCredito(null)
                .risco(RiscoEnum.TIPO_A.getTipo())
                .build();
    }

    public static ClienteResponse clienteResponseSemRisco() {
        return ClienteResponse.builder()
                .nome("Márcio Santos do Carmo")
                .limiteCredito(123456.0)
                .risco(null)
                .build();
    }

    public static ClienteResponse clienteResponseVazio() {
        return ClienteResponse.builder()
                .nome(null)
                .limiteCredito(null)
                .risco(null)
                .build();
    }
}
