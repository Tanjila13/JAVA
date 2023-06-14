
package pkg611basicday1;
import java.util.Scanner;

public class CelciustoFarenhite3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double cels,farn;
        System.out.print("celcius:");
         cels = input.nextDouble();
         
          farn = 1.8 * cels+32;
         System.out.println("Farenhiet: "+farn);
        
    }
    
}
