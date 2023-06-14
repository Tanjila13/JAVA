
package pkg611basicday1;

import java.util.Scanner;


public class Areacircle {
    public static void main(String[] args) {
        double radius,area;
        Scanner input = new Scanner(System.in);
        
        System.out.println("ENter radius: ");
        radius = input.nextDouble();
        
        
        
        area = 3.1416*radius*radius;
        System.out.println("Area of cirlce: "+area);
    }
    
}
