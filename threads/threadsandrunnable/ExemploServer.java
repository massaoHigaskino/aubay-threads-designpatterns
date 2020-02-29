package threads.threadsandrunnable;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
    Objetivo: Reescreva o código para que o tratamento de cada requisição seja feito por threads
*/
public class ExemploServer {

    public static long counter = 0;

    public static void main(String[] args) {
        new Thread(() -> server()).start();
    }

    public static void server() {
        try {
            ServerSocket servidor = new ServerSocket(12345);
            while (true) {
                Socket cliente = servidor.accept();
                new Thread(() -> handle(cliente)).start();
            }
        } catch (IOException e) {
        }
    }

    private static void handle(Socket cliente) {
        Scanner s = null;
        try {
            s = new Scanner(cliente.getInputStream());
            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
            System.out.println("Counter: " + ++counter);
            Thread.sleep(1000 * 10);
            System.out.println(ExemploServer.class.getName() + ": Processed");

        } catch (IOException | InterruptedException e) {
        } finally {
            if (s != null)
                s.close();
        }
    }

}