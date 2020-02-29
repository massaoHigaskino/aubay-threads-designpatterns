package threads.threadsandrunnable;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
    Objetivo: Reescreva o código para que o tratamento de cada requisição seja feito por threads e contar o número de requisições
*/
public class ExemploServerContador {

    private static long contador = 0;

    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(12345);
        while (true) {
            Socket cliente = servidor.accept();
            new Thread(() -> handle(cliente)).start();
        }
    }

    private static void handle(Socket cliente) {
        Scanner s = null;
        try {
            s = new Scanner(cliente.getInputStream());
            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
            contador++;
            System.out.println("Já foram " + contador + " requisições");
        } catch (IOException e) {

        } finally {
            s.close();
        }
    }

}