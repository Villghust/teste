package com.teste.contract.v1.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequest {
    @NotNull(message = "É necessário informar o nome!")
    private String id;
    @NotNull(message = "É necessário informar o nome!")
    private String nome;
    @NotNull(message = "É necessário informar o limite de crédito!")
    private double limiteCredito;
    @NotNull(message = "É necessário informar o risco!")
    private String risco;
}
