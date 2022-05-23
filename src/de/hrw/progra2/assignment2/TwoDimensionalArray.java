package de.hrw.progra2.assignment2;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        int[][] array = new int[10][10];

        //a)

        int counter = 1;

        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array.length; x++) {
                array[y][x] = counter;
                if (array[y][x] < 10) {
                    System.out.print(array[y][x] + "    ");
                } else {
                    System.out.print(array[y][x] + "   ");
                }
                counter++;
            }
            System.out.println();
        }
        System.out.println();


        //b)

        for (int y = 0; y < array.length; y++) {
            for (int x = 0; x < array.length; x++) {

                if (array[y][x] % 2 == 0) {
                    array[y][x] *= -1;
                }

                if (array[y][x] < 10 && array[y][x] > 0) {
                    System.out.print(array[y][x] + "   ");
                } else if (array[y][x] < 0 && array[y][x] > -10) {
                    System.out.print(array[y][x] + "    ");
                } else if (array[y][x] > 0) {
                    System.out.print(array[y][x] + "  ");
                } else {
                    System.out.print(array[y][x] + "   ");
                }

                counter++;

            }
            System.out.println();
        }
        System.out.println();


        //c)

        for (int y = 9; y >= 0; y--) {
            for (int x = 0; x <= 9; x++) {

                if (array[y][x] < 10 && array[y][x] > 0) {
                    System.out.print(array[y][x] + "   ");
                } else if (array[y][x] < 0 && array[y][x] > -10) {
                    System.out.print(array[y][x] + "    ");
                } else if (array[y][x] > 0) {
                    System.out.print(array[y][x] + "  ");
                } else {
                    System.out.print(array[y][x] + "   ");
                }

            }
            System.out.println();
        }
    }
}
