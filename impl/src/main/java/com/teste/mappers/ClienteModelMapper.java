package com.teste.mappers;

import com.teste.database.model.Cliente;
import com.teste.enumeration.RiscoEnum;
import com.teste.model.ClienteModel;

public class ClienteModelMapper {

    public static Cliente clienteModelToCliente(ClienteModel clienteModel) {
        return Cliente.builder()
                .id(clienteModel.getId())
                .nome(clienteModel.getNome())
                .limiteCredito(clienteModel.getLimiteCredito())
                .risco(clienteModel.getRisco().getTipo())
                .build();
    }

    public static ClienteModel clienteToClienteModel(Cliente cliente) {
        return ClienteModel.builder()
                .id(cliente.getId())
                .nome(cliente.getNome())
                .limiteCredito(cliente.getLimiteCredito())
                .risco(RiscoEnum.fromValue(cliente.getRisco()))
                .build();
    }
}
