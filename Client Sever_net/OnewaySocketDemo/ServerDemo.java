
package OnewaySocketDemo;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.DataInputStream;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        
        ServerSocket ss = new ServerSocket(5123);
        System.out.print("Server Connected");
        System.out.print("Waiting fo cilent");
        
        Socket s = ss.accept();
        System.out.print("Waiting fo cilent");
        
        DataInputStream input = new DataInputStream(s.getInputStream());
        
        String str = "";
        while(!str.equals("exit")){
            
        str  = input.readUTF();
        System.out.print("Client says: "+str);
        
        }
        
        input.close();
        ss.close();
    
    }
}
