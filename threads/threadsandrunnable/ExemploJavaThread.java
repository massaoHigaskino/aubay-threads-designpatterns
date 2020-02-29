package threads.threadsandrunnable;

import java.io.IOException;


/*
    Objetivo: Crie uma thread usando a sintaxe de herança, uma thread que conte até 100
*/
public class ExemploJavaThread {

    public static void main(String[] args) throws IOException {
        new Tarefa1().start();
    }

}

class Tarefa1 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}