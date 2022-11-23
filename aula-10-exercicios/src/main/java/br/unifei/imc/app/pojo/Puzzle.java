package br.unifei.imc.app.pojo;

import br.unifei.imc.framework.anotacao.Ignorar;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Puzzle {

    private String nome;
    private double preco;
    private int qtdPecas;
    @Ignorar
    private double altura,largura;

}