
package day_5;

import java.util.Scanner;


public class LOgicalorDemo {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        char c;
        
        System.out.println("Enter any Char: ");
        c = input.next().charAt(0);
        
        if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
        {
        System.out.println("vowel");
        
        }
        else{System.out.println("Consonent");}
        
    }
    
}
