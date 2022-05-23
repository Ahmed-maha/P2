package de.hrw.progra2.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String eingabe = scanner.nextLine();


        //a)

        byte[] array = eingabe.getBytes();

        System.out.println(Arrays.toString(array));


        //b)

        eingabe = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        String Word;
        String lastLetter = "";

        for (int i = 0; i < eingabe.length(); i++) {

            while (i != eingabe.length() && eingabe.charAt(i) != ' ') {     //
                list.add(String.valueOf(eingabe.charAt(i)));                //Bilde eine Liste aus einem Wort
                i++;                                                        //
            }

            if (list.size() >= 4) {                                         //Mische nur wenn Wort mehr als 3 Buchstaben hat

                System.out.print(list.get(0));                              //Gib den ersten Buchstaben des Wortes aus
                lastLetter = list.get(list.size() - 1);                     //Speicher den letzten Buchstaben in einer Variable
                list.remove(0);                                       //Lösche danach den ersten Buchstaben aus der Liste
                list.remove(list.size() - 1);                         //Lösche danach den letzten Buchstaben aus der Liste

                Collections.shuffle(list);                                  //Mische die Liste / das Wort durch
            }

            Word = String.valueOf(list);                                    //Bilde ein String aus der Liste

            Word = Word                                                     //
                    .replace("[", "")                      //
                    .replace("]", "")                      //Entferne alle Zeichen, die beim konvertieren von Liste in Strings entstehen
                    .replace(",", "")                      //
                    .replace(" ", "");                     //

            if (i == eingabe.length()) {                                    //Ausgabe, wenn wir beim letzten Wort sind
                System.out.println(Word + lastLetter);                      //
            } else {                                                        //Ausgabe bei allen anderen Wörtern
                System.out.print(Word + lastLetter + " ");                  //
            }
            list.clear();                                                   //Listeinhalt nach Ausgabe löschen
            lastLetter = "";                                                //Variable löschen
        }


        //c)

        double result = 0;
        boolean firstDigit = true;

        String str = scanner.nextLine();

        String regex = "\\d+(?:\\.\\d+)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            if (firstDigit) {
                System.out.print(str.substring(matcher.start(), matcher.end()));
                firstDigit = false;
            } else {
                System.out.print(" + " + str.substring(matcher.start(), matcher.end()));
            }
            result += Double.parseDouble(str.substring(matcher.start(), matcher.end()));
        }

        System.out.println(" = " + result);

        scanner.close();
    }
}
