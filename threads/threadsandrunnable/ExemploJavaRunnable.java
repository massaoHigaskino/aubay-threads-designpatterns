package threads.threadsandrunnable;

import java.io.IOException;


/*
    Objetivo: Crie uma thread usando runnable/com classe anônima também, que imprima os números pares até 100
*/
public class ExemploJavaRunnable {

    public static void main(String[] args) throws IOException {
        new Thread(new Runnable(){
        
            @Override
            public void run() {
                System.out.println(ExemploJavaRunnable.class.getName() + ": classe anônima.");
            }
        }).start();
    }

}