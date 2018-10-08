package com.teste.stub;

import com.teste.database.model.Cliente;
import com.teste.enumeration.RiscoEnum;

public class ClienteStub {

    public static Cliente clienteStub() {
        return Cliente.builder()
                .nome("Márcio Santos do Carmo")
                .limiteCredito(123456.0)
                .risco(RiscoEnum.TIPO_A.getTipo())
                .build();
    }

    public static Cliente clienteSemNome() {
        return Cliente.builder()
                .nome(null)
                .limiteCredito(123456.0)
                .risco(RiscoEnum.TIPO_A.getTipo())
                .build();
    }

    public static Cliente clienteSemLimiteCredito() {
        return Cliente.builder()
                .nome("Márcio Santos do Carmo")
                .limiteCredito(null)
                .risco(RiscoEnum.TIPO_A.getTipo())
                .build();
    }

    public static Cliente clienteSemRisco() {
        return Cliente.builder()
                .nome("Márcio Santos do Carmo")
                .limiteCredito(123456.0)
                .risco(null)
                .build();
    }

    public static Cliente clienteVazio() {
        return Cliente.builder()
                .nome(null)
                .limiteCredito(null)
                .risco(null)
                .build();
    }
}
