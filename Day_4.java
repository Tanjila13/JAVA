
package day_4;
import java.util.Scanner;


public class Day_4 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       double c,f;
       
       System.out.println("celcius= ");
       c = input.nextDouble();
       
       f = 9/5*c+32;
       System.out.println("Farenhiet= "+f);
       
       System.out.println("farenhiet= ");
       f = input.nextDouble();
       
        c = 9/5*c-32;
       System.out.println("celcius= "+c);
       
    }
    
}
