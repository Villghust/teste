package com.teste.contract.v1.mapper;

import com.teste.contract.v1.model.request.ClienteRequest;
import com.teste.contract.v1.model.response.ClienteResponse;
import com.teste.enumeration.RiscoEnum;
import com.teste.model.ClienteModel;

public class ClienteMapper {

    public static ClienteResponse mapperToContract(ClienteModel clienteModel) {
        return ClienteResponse.builder()
                .id(clienteModel.getId())
                .nome(clienteModel.getNome())
                .limiteCredito(clienteModel.getLimiteCredito())
                .risco(clienteModel.getRisco().getTipo())
                .build();
    }

    public static ClienteModel mapperToModel(ClienteRequest clienteRequest) {
        return ClienteModel.builder()
                .id(clienteRequest.getId())
                .nome(clienteRequest.getNome())
                .limiteCredito(clienteRequest.getLimiteCredito())
                .risco(RiscoEnum.fromValue(clienteRequest.getRisco()))
                .build();
    }
}
