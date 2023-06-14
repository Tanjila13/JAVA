package day14;

public class Array2D {

    public static void main(String[] args) {

        int[][] numbers = new int[2][3];

        numbers[0][0] = 5;
        numbers[0][1] = 15;
        numbers[0][2] = 25;
        numbers[1][0] = 55;
        numbers[1][1] = 65;
        numbers[1][2] = 85;

        //System.out.println(numbers[0][2]) //print 0th row & 2th colum
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" " + numbers[row][col]);

            }
           System.out.println();//getting new line before 2nd line
        }

    }

}
