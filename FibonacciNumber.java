package assignment1;

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number: ");

        int n = input.nextInt();
        int first = 0;
        int second = 1;
        int fibo;
        System.out.println(first + " " + second);
        int i;

        for (i = 3; i <= n; i++) {
            fibo = first + second;
            System.out.print(" "+fibo);
            first = second;
            second = fibo;
        }
    }
}
