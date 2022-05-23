package de.hrw.progra2.assignment3;

public class MiddleCharacter {

    public static void main(String[] args) {

        System.out.println(middleCharacter("Reifenmaschine"));
        System.out.println(middleCharacter('R', 'e', 'i', 'f', 'e', 'n', 'm', 'a', 's', 'c', 'h', 'i', 'n', 'e'));

    }

    public static String middleCharacter(String word) {

        if (word.length() % 2 == 0) {
            return word.charAt((word.length() / 2) - 1) + "" + word.charAt(word.length() / 2) + "";
        } else {
            return word.charAt(word.length() / 2) + "";
        }

    }

    public static String middleCharacter(char... array) {

        if (array.length % 2 == 0) {
            return array[(array.length / 2) - 1] + "" + array[(array.length / 2)] + "";
        } else {
            return array[(array.length / 2)] + "";
        }

    }

}