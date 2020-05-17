package Java;

import java.net.*;
import java.io.*;

public class MyClient {

   public static void main(String [] args) {
      String serverName = "localhost";
      
      try {
         System.out.println("Connecting to " + serverName + " on port " + 4444);
         Socket client = new Socket(serverName, 4444);
         
         System.out.println("Just connected to " + client.getRemoteSocketAddress());
         OutputStream outToServer = client.getOutputStream();
         DataOutputStream out = new DataOutputStream(outToServer);
         
         out.writeUTF("Hello from " + client.getLocalSocketAddress());
         InputStream inFromServer = client.getInputStream();
         DataInputStream in = new DataInputStream(inFromServer);
         
         System.out.println("Server says " + in.readUTF());
         client.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}