package day3;

import java.util.Scanner;

public class UserOPeratorin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2, result;
              

        System.out.println("Enter First Number : ");
          num1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = input.nextInt();
        
        result=num1+num2;
        System.out.println(+result);
        
        result=num1-num2;
        System.out.println(+result);
        
        result=num1*num2;
        System.out.println(+result);
        
        result=num1/num2;
        System.out.println(+result);
        
        result=num1%num2;
        System.out.println(+result);
        
        //for this formula convert integer to double
        double result2=(double)num1/num2;
        System.out.println(+result2);
        
        
        
        
        

    }

}
