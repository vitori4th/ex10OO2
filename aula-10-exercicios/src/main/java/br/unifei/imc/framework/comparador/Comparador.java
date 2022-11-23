package br.unifei.imc.framework.comparador;

import br.unifei.imc.framework.anotacao.Ignorar;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Comparador {
    public static <T>List<Diferenca> comparador(T bg1, T bg2) {
        List<Diferenca> listaD = new ArrayList<Diferenca>();

        var clazz = bg1.getClass();
        var clazz2 = bg1.getClass();

        for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(Ignorar.class) ){
                    continue;
                }
                    Object valor1 = null;
                    Object valor2 = null;
                    try {
                        field.setAccessible(true);
                        valor1 = field.get(bg1);
                        valor2 = field.get(bg2);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if(!valor1.equals(valor2)){
                        Diferenca dif = new Diferenca(field.getName(),valor1,valor2);
                        listaD.add(dif);
                    }
        }
        return listaD;
    }
}
