
package pkg611basicday1;
import java.util.Scanner;

public class capitalsmallAndoperator {
    public static void main(String[] args) {
        
        char ch;
        Scanner input = new Scanner(System.in);
        
       System.out.print("enter any number: ");
       ch = input.next().charAt(0);
       
       if(ch >='a' && ch <='z'){
       
       System.out.println("Small later");
       }
       else if(ch >= 'A' && ch <='Z'){
       
       System.out.println("Capital later");}
       
       else{
       System.out.println("not match");
       }
           
      
        
    }
    
}
