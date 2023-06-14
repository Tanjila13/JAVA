
package pkg611basicday1;
import java.util.Scanner;

public class Conditionalop {
    public static void main(String[] args) {
        
        int a,b,large;
        Scanner input = new Scanner(System.in);
        
        System.out.print("ENter two numbers: "); 
        a = input.nextInt();
        b = input.nextInt();
        
        large = (a>b)? a:b;
        System.out.println("Large value: "+large);
        
        
        
        
    }
    
}
