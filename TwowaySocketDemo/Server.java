
package TwowaySocketDemo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
 public static void main(String[] args) throws IOException{ 
     ServerSocket ss = new ServerSocket(5123);
     System.out.println("Server Connected");
     System.out.println("waitting for client");
     
     Socket S = ss.accept();
     System.out.println("Request is accepted");
     
     DataInputStream input = new DataInputStream(S.getInputStream());
     DataOutputStream output = new DataOutputStream(S.getOutputStream());
     BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
     
     String Instr ="";
     String Outstr="";
     
     while(!Instr.equals("exit")){
     Instr=input.readUTF();
     System.out.println("Client :"+Instr);
     
     Outstr = read.readLine();
     output.writeUTF(Outstr);
     
     }
     
     input.close();
     output.close();
     ss.close();
     
     
     
     
    
    
    
    }
        
    }
    

