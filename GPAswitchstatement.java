
package pkg611basicday1;
import java.util.Scanner;

public class GPAswitchstatement {
    public static void main(String[] args) {
        
        int number;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        number = input.nextInt();
        
        switch(number){
        
            case (80-100):
                System.out.println("A+");
                break;
                
                case (70):
                System.out.println("A");
                break;
                    
                case (60):
                System.out.println("A-");
                break;
                        
                case 50-59:
                System.out.println("B");
                break;
                
                case 40:
                System.out.println("C");
                break;
                    
                case 33:
                System.out.println("D");
                break;
                    
                    
                default:
                System.out.println("F");
               
        
        
        
        
        } 
        
    }
    
}
