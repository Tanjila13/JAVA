
package pkg611basicday1;
import java.util.Scanner;

public class Oddevendemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a ;
        System.out.println("Enter any positive number: ");
        a = input.nextInt();
        
        if(a%2==0){
        
        System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
    
}
