
package postdemo;

import java.net.URL;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;



public class POstDemo {

   
   public static void main(String[] args) throws MalformedURLException, IOException {
       final String POST = "Successful" + "\n";
 System.out.println(POST);
       
 URL url = new URL("https://jsonplaceholder.typicode.com/posts");
 HttpURLConnection postConnection = (HttpURLConnection) url.openConnection();
 postConnection.setRequestMethod("POST");
 postConnection.setRequestProperty("User-agent", "Chrome");
 postConnection.setDoOutput(true);
 OutputStream write = postConnection.getOutputStream();
 write.write(POST.getBytes());
 write.flush();
 write.close();
 
 int response = postConnection.getResponseCode();
 System.out.println("Post Response: "+response);
 System.out.println("Response Message: "+postConnection.getResponseCode());
 
 if(response == HttpURLConnection.HTTP_CREATED){
     BufferedReader read = new BufferedReader(new InputStreamReader(postConnection.getInputStream()));
     
     String inputLine;
     StringBuffer response2 = new StringBuffer();
     
     while((inputLine =  read.readLine())!=null){
     response2.append(inputLine);
     
     }
     
     read.close();
     System.out.println(response2.toString());
 }
 else{System.out.println("Post not connected");
 }
     
 }}
        
  
    

