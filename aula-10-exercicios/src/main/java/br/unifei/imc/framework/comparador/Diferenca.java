package br.unifei.imc.framework.comparador;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Diferenca {
    private String nomePropriedade;
    private Object valor1;
    private Object valor2;
}
