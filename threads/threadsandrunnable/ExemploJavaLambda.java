package threads.threadsandrunnable;

import java.io.IOException;


/*
    Objetivo: Crie uma thread usando a sintaxe de lambda expression
*/
public class ExemploJavaLambda {

    public static void main(String[] args) throws IOException {
        Runnable runnable = () -> {
            System.out.println("Executando");
        };
        Thread t1 = new Thread(runnable);
        t1.start();
    }

}