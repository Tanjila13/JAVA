
package OnewaySocketDemo;
import java.io.IOException;
import java.net.Socket;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CilentDemo {
    public static void main(String[] args)throws IOException {
        
        Socket s = new Socket("Localhost",5123);
        System.out.print("Connected");
        
        DataOutputStream output = new DataOutputStream(s.getOutputStream());
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        String str = "";
        while(!str.equals("exit")){
            
        str  = read.readLine();
        output.writeUTF(str);
        
        
        }
        
        output.close();
        s.close();
        
    }
    
}
