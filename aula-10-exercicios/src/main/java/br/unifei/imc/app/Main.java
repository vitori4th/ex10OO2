package br.unifei.imc.app;

import br.unifei.imc.app.pojo.BoardGame;
import br.unifei.imc.framework.comparador.Comparador;
import br.unifei.imc.framework.comparador.Diferenca;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        BoardGame bg1 = new BoardGame("Sagrada",4,500);
        BoardGame bg2 = new BoardGame("Sagrada",6,500);
        List<Diferenca> diferencas = Comparador.comparador(bg1,bg2);
        diferencas.forEach(d -> {
            System.out.println(d.getNomePropriedade());
            System.out.println(d.getValor1());
            System.out.println(d.getValor2());
        });
    }
}