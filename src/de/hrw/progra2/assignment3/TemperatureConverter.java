package de.hrw.progra2.assignment3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TemperatureConverter {

    public static void main(String[] args) {

        boolean useInteger = false;
        int unit;
        double temp;
        String regex = "\\d+(?:\\.\\d+)?";
        Pattern pattern = Pattern.compile(regex);
        String errText = "Ihre Eingabe war nicht korrekt! optional: <'--useInteger'> <'0' = unitConvert in Kelvin, '1' = unitConvert in Fahrenheit> <Temp in Fließkommazahl>";

        if (args.length == 3) {

            if (args[0].equals("--useInteger")) {

                useInteger = true;

                if (args[1].equals("0") || args[1].equals("1")) {

                    unit = Integer.parseInt(args[1]);

                    String str = args[2];

                    Matcher matcher = pattern.matcher(str);

                    if (matcher.find()) {

                        temp = Double.parseDouble(str.substring(matcher.start(), matcher.end()));
                        convert(useInteger, unit, temp);
                        return;

                    }

                    System.err.println(errText);

                } else {
                    System.err.println(errText);
                }

            } else {
                System.err.println(errText);
            }

        } else if (args.length == 2) {

            if (args[0].equals("0") || args[0].equals("1")) {

                unit = Integer.parseInt(args[0]);

                String str = args[1];

                Matcher matcher = pattern.matcher(str);

                if (matcher.find()) {

                    temp = Double.parseDouble(str.substring(matcher.start(), matcher.end()));
                    convert(useInteger, unit, temp);
                    return;

                }

                System.err.println(errText);

            } else {
                System.err.println(errText);
            }

        } else {
            System.err.println(errText);
        }

    }

    public static void convert(boolean useInteger, int unit, double temp) {
        String unitText;
        if (unit == 0) {
            unitText = "Kelvin";
            temp += 273.15;
        } else {
            unitText = "F";
            temp = temp * 9 / 5 + 32;
        }

        if (useInteger) {
            System.out.println("ergbit: " + (int) temp + " " + unitText);
        } else {
            System.out.println("ergbit: " + temp + " " + unitText);
        }
    }

    /*
    public static double getDouble(String input){

        double temp = 0;

        String regex = "\\d+(?:\\.\\d+)?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {

            temp = Double.parseDouble(input.substring(matcher.start(), matcher.end()));

        }

        return temp;

    }
    */
}



