
package pkg611basicday1;
 import java.util.Scanner;

public class logicaloperatorvowlcons {
    
    public static void main(String[] args) {
        
        char chr;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any character: ");
        chr = input.next().charAt(0);
        
        if(chr == 'a' || chr == 'A' || chr == 'e' || chr == 'E' || chr == 'i' || chr == 'I' || chr == 'o' || chr == 'O'|| chr == 'u'|| chr == 'U' )
        {
        System.out.println("vowel");}
        
        else{
        System.out.print("consonet");
        }
        
       
        
        /*if(chr == 'a' || chr == 'A'){
        System.out.println("vowel");
        
       }
        
        else if(chr == 'e' || chr == 'E'){
        System.out.println("vowel");
    }
         else if(chr == 'i' || chr == 'I'){
        System.out.println("vowel");
    }
         else if(chr == 'o' || chr == 'O'){
        System.out.println("vowel");
    }
        
        else if(chr == 'u' || chr == 'U'){
        System.out.println("vowel");
    }*/
         
        
    }
    
}
