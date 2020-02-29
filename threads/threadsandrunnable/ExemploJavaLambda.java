package threads.threadsandrunnable;

import java.io.IOException;


/*
    Objetivo: Crie uma thread usando a sintaxe de lambda expression
*/
public class ExemploJavaLambda {

    public static void main(String[] args) throws IOException {
        new Thread(() -> System.out.println(ExemploJavaLambda.class.getName() + ": Teste")).start();
    }

}