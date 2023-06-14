
package day_5;

import java.util.Scanner;

public class LogicalandDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    char x;
    
    System.out.println("Enter any letter");
    x = input.next().charAt(0);
    
    if(x>='a'&& x<='z'){
    System.out.println("small letter");
    }
    else if(x>='A'&& x<='Z')
    {
    System.out.println("Capital letter");
    }
    else{
    System.out.println("not found");
    }
    }
    
}
