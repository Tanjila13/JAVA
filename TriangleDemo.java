
package pkg611basicday1;
import java.util.Scanner;

public class TriangleDemo {
    public static void main(String[] args) {
        
        double height,base,area;
        Scanner input = new Scanner(System.in);
        
        System.out.println("ENter base: ");
        base = input.nextDouble();
        
        System.out.println("ENter height: ");
        height = input.nextDouble();
        
        
        area = 0.5*base*height;
        System.out.print("Area of tringle: "+area);
    }
    
}
