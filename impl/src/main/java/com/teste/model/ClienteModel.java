package com.teste.model;

import com.teste.enumeration.RiscoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteModel {
    private String id;
    private String nome;
    private Double limiteCredito;
    private RiscoEnum risco;
}
