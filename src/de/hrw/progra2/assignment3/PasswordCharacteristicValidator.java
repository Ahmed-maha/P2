package de.hrw.progra2.assignment3;

import java.util.Scanner;

public class PasswordCharacteristicValidator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.println("Bitte geben sie ein Passwort ein!");
            password = scanner.nextLine();
        } while (!isStrongPassword(password));

        System.out.println("Sie haben Ihr Passwort erfolgreich erstellt!");

    }

    public static boolean isStrongPassword(String password) {

        return checkLength(password) &
                checkUpperLowerCases(password) &
                checkMixOfLetters(password) &
                containsSpecialCharacters(password) &
                doesNotContainArrow(password);

    }

    public static boolean checkLength(String password) {
        if (password.length() >= 12){
            return true;
        }
        System.out.println("Die Länge ist NICHT ausreichend! Mindestens 12 Zeichen!");
        return false;

    }

    public static boolean checkUpperLowerCases(String password) {

        boolean containsUpperCase = false;
        boolean containsLowerCase = false;
        char[] letterArray = password.toCharArray();

        for (char i : letterArray) {
            if (i >= 65 && i <= 90) {
                containsUpperCase = true;
            }
            if (i >= 97 && i <= 122) {
                containsLowerCase = true;
            }
            if (containsLowerCase && containsUpperCase) {
                return true;
            }
        }
        if (!containsUpperCase){
            System.out.println("Das Passwort muss Großbuchstaben enthalten!");
        }
        if (!containsLowerCase){
            System.out.println("Das Passwort muss Kleinbuchstaben enthalten!");
        }

        return false;
    }

    public static boolean checkMixOfLetters(String password) {

        boolean containsLetter = false;
        boolean containsDigits = false;
        char[] letterArray = password.toCharArray();

        for (char i : letterArray) {
            if ((i >= 65 && i <= 90) || (i >= 97 && i <= 122)) {
                containsLetter = true;
            }
            if (i >= 48 && i <= 57) {
                containsDigits = true;
            }
            if (containsLetter && containsDigits) {
                return true;
            }
        }
        System.out.println("Das Passwort muss aus einem Mix von Buchstaben und Zahlen bestehen!");
        return false;
    }

    public static boolean containsSpecialCharacters(String password) {
        if (password.contains("!") || password.contains("@") || password.contains("#") || password.contains("?")){
            return true;
        }
        System.out.println("Es ist keines der folgenden Sonderzeichen vorhanden! (!, @, #, ?)");
        return false;
    }

    public static boolean doesNotContainArrow(String password) {
        if (!password.contains("<") && !password.contains(">")){
            return true;
        }
        System.out.println("Die Sonderzeichen \"<\" und \">\" sind nicht erlaubt!");
        return false;
    }

}
