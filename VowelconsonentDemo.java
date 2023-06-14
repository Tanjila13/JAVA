
package pkg611basicday1;
import java.util.Scanner;

public class VowelconsonentDemo {
    public static void main(String[] args) {
        
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any later: ");
        
        
     ch = input.next().charAt(0);
         
     if(ch == 'a'){
         
    System.out.println("vowel");
    
    }
     else if(ch == 'e'){
     
        System.out.println("vowel");
     }
        else if(ch == 'i'){
     
        System.out.println("vowel");
     }
     
    else if(ch == 'o'){
     
        System.out.println("vowel"); 
    }
        
        else if(ch == 'u'){
     
        System.out.println("vowel");
    }
        else{
        System.out.println("consonent");
        }
     
    
    }
}
