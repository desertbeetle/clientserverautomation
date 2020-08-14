package com.javalab.clientserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        int port = 5000;
        ServerSocket serverSocket;
        serverSocket = new ServerSocket(port);
        System.out.println("server ready!");
        while (true) {
            Socket socket = serverSocket.accept();
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            String message = (String)ois.readObject();
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject("Hi client. I got your message " + message);
            ois.close();
            oos.close();
            socket.close();
            if (message.equals("exit")) {
                break;
            }
        }
        System.out.println("Server closing down.");
        serverSocket.close();

    }
}


    // Alternatively, the server could be a class holding socket as instance variables
    // In order to start the server we simply create the server object in the main() method
    //        Server server = new Server(5000);

    // instance variables
    //private Socket socket   = null;
    //private ServerSocket server   = null;
    //private DataInputStream in       =  null;

    /**
    public Server(int port)
    {
        // starts server and waits for a connection
        try
        {
            server = new ServerSocket(port);
            System.out.println("Server started");

            System.out.println("Waiting for a client ...");
            System.out.println("Server ready");


            socket = server.accept();
            System.out.println("Client accepted");

            // takes input from the client socket
            in = new DataInputStream(
                    new BufferedInputStream(socket.getInputStream()));

            String line = "";

            // reads message from client until "Over" is sent
            while (!line.equals("Over"))
            {
                try
                {
                    line = in.readUTF();
                    System.out.println(line);

                }
                catch(IOException i)
                {
                    System.out.println(i);
                }
            }
            System.out.println("Closing connection");

            // close connection
            socket.close();
            in.close();
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
     **/


