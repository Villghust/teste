package com.teste.stub;

import com.teste.enumeration.RiscoEnum;
import com.teste.model.ClienteModel;

public class ClienteModelStub {

    public static ClienteModel clienteModelStub() {
        return ClienteModel.builder()
                .nome("Márcio Santos do Carmo")
                .limiteCredito(123456.0)
                .risco(RiscoEnum.TIPO_A)
                .build();
    }

    public static ClienteModel clienteModelSemNome() {
        return ClienteModel.builder()
                .nome(null)
                .limiteCredito(123456.0)
                .risco(RiscoEnum.TIPO_A)
                .build();
    }

    public static ClienteModel clienteModelSemLimiteCredito() {
        return ClienteModel.builder()
                .nome("Márcio Santos do Carmo")
                .limiteCredito(null)
                .risco(RiscoEnum.TIPO_A)
                .build();
    }

    public static ClienteModel clienteModelSemRisco() {
        return ClienteModel.builder()
                .nome("Márcio Santos do Carmo")
                .limiteCredito(123456.0)
                .risco(null)
                .build();
    }

    public static ClienteModel clienteModelVazio() {
        return ClienteModel.builder()
                .nome(null)
                .limiteCredito(null)
                .risco(null)
                .build();
    }
}
