package threads.threadsandrunnable;

import java.io.IOException;


/*
    Objetivo: Crie uma thread usando runnable/com classe anônima também, que imprima os números pares até 100
*/
public class ExemploJavaRunnable {

    public static void main(String[] args) throws IOException {
        Runnable runnable = new Runnable(){
        
            @Override
            public void run() {
                System.out.println("Teste");
            }
        };
        
    }

}