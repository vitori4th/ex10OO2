package br.unifei.imc.framework.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //disponível em tempo de execução
@Target(ElementType.FIELD) //disponível para campos
public @interface Ignorar {
}
