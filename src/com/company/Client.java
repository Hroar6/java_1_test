package com.company;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ServerSocket server = null;
        Socket socket = null;
        final int PORT = 8189;

        try {

//            server = new ServerSocket(PORT);
            socket = new Socket("localhost", PORT);
            Scanner in = new Scanner(socket.getInputStream());
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner inConsole = new Scanner(System.in);

            Thread getMessage = new Thread(() -> {
                while (true) {
                    String message = in.nextLine();
                    System.out.println("echo: " + message);
                }
            });

            getMessage.start();

            while (true) {
                String str = inConsole.nextLine();
                out.println(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
