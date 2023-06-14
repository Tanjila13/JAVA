
package pkg611basicday1;
import java.util.Scanner;

public class IfElsestatement {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number : ");
          int x = input.nextInt();
          
          if(x<=10){
          System.out.println("positive");
          
          }
          else if(x>10){
              System.out.println("Negetive");}
          
          else {System.out.println("equal to zero");}
        
         }
    }
    

