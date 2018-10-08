package com.teste.contract.v1.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteResponse {
    private String id;
    private String nome;
    private Double limiteCredito;
    private String risco;
}
