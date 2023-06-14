package day11;

import java.util.Scanner;

public class PatternDemo {

    public static void main(String[] args) {
        ;
        

        int row, col;
        for (row = 10; row >= 1; row--) {
            for (col = 1; col <= row; col++) {
                System.out.print(" " + col);
            }
            System.out.println();
        }

    }

}
