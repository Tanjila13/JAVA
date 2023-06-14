
package pkg611basicday1;
import java.util.Scanner;

public class farenhiettocelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double farn,cels;
        System.out.print("Farenhiet: ");
        
        farn = input.nextDouble();
        cels = 0.5* farn-32;
        System.out.println("Celcius: "+cels);
        
        
    }
    
}
