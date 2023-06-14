
package pkg611basicday1;

import java.util.Scanner;
public class Input2 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
         int a ;
         System.out.print("Enter any number: ");//user input
         a = input.nextInt();
         System.out.println("number = "+a);  
         
         int c,b ;
         System.out.print("Enter two number: ");//user input and addition
         c = input.nextInt();
         b = input.nextInt();
    int d = c+b;
    System.out.println(d);
    
    
    String name;
    System.out.print("Enter Your name: ");
    name = input.nextLine();
    System.out.println("My name is: "+name);
    
    
    
    }
    
}
