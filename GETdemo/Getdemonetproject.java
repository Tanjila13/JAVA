
package netproject;
import java.net.URL;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Getdemonetproject {

    
    public static void main(String[] args) throws IOException
    {
        URL url  = new URL("https://jsonplaceholder.typicode.com/posts");
        HttpURLConnection connect = (HttpURLConnection) url.openConnection();
         connect.setRequestMethod("GET");
         connect.setRequestProperty("User-agent", "Chrome");
         int response = connect.getResponseCode();
         System.out.println("Response "+response);
         System.out.println("Response Message "+connect.getResponseMessage());
         
         if(response == HttpURLConnection.HTTP_OK){
         BufferedReader read = new BufferedReader(new InputStreamReader(connect.getInputStream()));   
         StringBuffer str = new StringBuffer();
         
         String store = null;
         while((store = read.readLine())!= null){
             
             str.append(store);
         }
         read.close();
         }
         
        
    }
    
}
