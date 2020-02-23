package threads.threadsandrunnable;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


/*
    Objetivo: Reescrever o código para que o tratamento de cada requisição seja feito por threads
*/
public class ExampleServer {

    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(12345);
        while (true) {
            Socket cliente = servidor.accept();
            Scanner s = new Scanner(cliente.getInputStream());
            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
            s.close();
        }
    }

}