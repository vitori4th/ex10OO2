package br.unifei.imc.teste;

import br.unifei.imc.app.pojo.BoardGame;
import br.unifei.imc.framework.comparador.Comparador;
import br.unifei.imc.framework.comparador.Diferenca;
import br.unifei.imc.app.pojo.Puzzle;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TesteComparador {

    @Test
    public void testeBGComparacao(){
        BoardGame bg1 = new BoardGame("Sagrada",4,500);
        BoardGame bg2 = new BoardGame("Sagrada",6,500);
        List<Diferenca> diferencas = Comparador.comparador(bg1,bg2);
        Assert.assertEquals(1,diferencas.size());
        Assert.assertEquals("qtdPlayers",diferencas.get(0).getNomePropriedade());
    }

    @Test
    public void testeBGComparacaoDuasProp(){
        BoardGame bg1 = new BoardGame("Sagrada",4,500);
        BoardGame bg2 = new BoardGame("Sagrada",6,650);
        List<Diferenca> diferencas = Comparador.comparador(bg1,bg2);

        Assert.assertEquals(2,diferencas.size());
        Assert.assertEquals("qtdPlayers",diferencas.get(0).getNomePropriedade());
        Assert.assertEquals("preco",diferencas.get(1).getNomePropriedade());
    }

    @Test
    public void testeComparacaoPuzzle1Prop(){
        Puzzle p1 = new Puzzle("Jardim Vitoriano",500,4000,97,56);
        Puzzle p2 = new Puzzle("Jardim Vitoriano",500,5000,105,107);

        List<Diferenca> diferencas = Comparador.comparador(p1,p2);

        Assert.assertEquals(1,diferencas.size());
        Assert.assertEquals("qtdPecas",diferencas.get(0).getNomePropriedade());
    }

    @Test
    public void testeComparacaoPuzzle(){
        Puzzle p1 = new Puzzle("Jardim Vitoriano",500,5000,97,56);
        Puzzle p2 = new Puzzle("Jardim Vitoriano",500,5000,105,107);

        List<Diferenca> diferencas = Comparador.comparador(p1,p2);

        Assert.assertEquals(0,diferencas.size());

    }

}