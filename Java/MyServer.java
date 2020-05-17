package Java;

import java.net.*;
import java.io.*;

public class MyServer extends Thread {
   private ServerSocket serverSocket;
   
   public MyServer(int port) throws IOException {
      serverSocket = new ServerSocket(4444);
         }

   public void run() {
      while(true) {
         try {
            System.out.println("Waiting for client on port " + 
               serverSocket.getLocalPort() + "...");
            Socket server = serverSocket.accept();
            
            System.out.println("Just connected to " + server.getRemoteSocketAddress());
            DataInputStream in = new DataInputStream(server.getInputStream());
            
            System.out.println(in.readUTF());
            DataOutputStream out = new DataOutputStream(server.getOutputStream());
            out.writeUTF("Thank you for connecting to " + server.getLocalSocketAddress()
               + "\nGoodbye!");
            server.close();
            
         } catch (SocketTimeoutException s) {
            System.out.println("Socket timed out!");
            break;
         } catch (IOException e) {
            e.printStackTrace();
            break;
         }
      }
   }
   
   public static void main(String [] args) {
      
      try {
         Thread t = new MyServer(4444);
         t.start();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}