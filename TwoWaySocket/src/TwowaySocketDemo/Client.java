
package TwowaySocketDemo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;




public class Client {
public static void main(String[] args) throws IOException {
    Socket S = new Socket("localhost",5123);
    System.out.println("Connected");
    
    DataOutputStream Output = new DataOutputStream (S.getOutputStream());
    DataInputStream input = new DataInputStream (S.getInputStream());
    BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
    
    String Outstr = "";
    String Instr = "";
    
    while(!Outstr.equals("Exit")){
        Outstr = read.readLine();
        Output.writeUTF(Outstr);
        
        Instr = input.readUTF();
        System.out.println("Server: "+Instr);
    }
    Output.close();
    input.close();
    S.close();
        
        
        
    
    }
    
    }
 

    

