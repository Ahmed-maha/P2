package de.hrw.progra2.assignment1;

public class NumberSeries {

    public static void main(String[] args) {

        int g = 1;
        int p_g;

        while (g <= 20){
            p_g = g*(g+1)/2;
            System.out.println("g = " + g + " und p_g = " + p_g);
            g++;
        }

    }

}
