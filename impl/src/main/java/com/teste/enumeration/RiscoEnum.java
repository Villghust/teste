package com.teste.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public enum RiscoEnum {

    TIPO_A("A", 1),
    TIPO_B("B", 1.1),
    TIPO_C("C", 1.2);

    private String tipo;
    private double taxa;

    public static RiscoEnum fromValue(String tipo) {

        if(tipo == null) return null;

        switch(tipo) {
            case "B":
                return TIPO_B;

            case "C":
                return TIPO_C;

            default:
                return TIPO_A;
        }
    }
}
