package com.br.questquadirx.util.infra;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.FIELD})
public @interface LikeField
{
}

/* Location:           C:\Users\leite\.m2\repository\br\gov\saude\infraestrutura\persistencia\1.2.0\persistencia-1.2.0.jar
 * Qualified Name:     br.gov.saude.infraestrutura.persistence.util.LikeField
 * Java Class Version: 5 (49.0)
 * JD-Core Version:    0.5.3
 */