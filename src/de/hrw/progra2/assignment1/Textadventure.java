package de.hrw.progra2.assignment1;

import java.util.Objects;
import java.util.Scanner;

public class Textadventure {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String i;
        int j;

        System.out.println("Du möchtest gerade dein Lieblings Mathematikbuch zurückbringen, als plötzlich eine Mumie aus dem Gang der Bücherei hervortritt!");
        System.out.println("Was wirst du tun?");
        System.out.println("a: Renne aus dem Gebäude!");
        System.out.println("b: Gehe auf die Mumie zu und schlage ihr in den Bauch!");
        System.out.println("c: Nimm dir die Schrotflinte die unter dem Tresen des Bib-Counters liegt und schieß auf die Mumie");
        System.out.println("x: um zu beenden");

        i = scanner.nextLine();

        if (Objects.equals(i, "a")) {
            System.out.println("Gut, du konntest vor der Mumie fliehen und gehst nach hause!");
        } else if (Objects.equals(i, "b")) {
            System.out.println("Du bist anscheinend wirklich kräftig! Die Mumie geht zu Boden! Allerdings versucht sie wenige Sekunden später, bereits wieder aufzustehen.");
            System.out.println("Was machst du als nächstes: ");
            System.out.println("a: Du trittst nochmal nach, in der Hoffnung, sie so ausschalten zu können!");
            System.out.println("b: Du schnappst dir den Besen, der in der Ecke steht, und prügelst auf die Mumie ein!");
            System.out.println("c: Du flüchtest in einen der Hörsäle, weil du dort auf Unterstützung hoffst!");
            System.out.println("x: um zu beenden");

            i = scanner.nextLine();

            if (Objects.equals(i, "a")) {
                System.out.println("Leider hast du sie jetzt so richtig wütend gemacht und wirst verspeist!");
                System.out.println("Ende");
            } else if (Objects.equals(i, "b")) {
                System.out.println("Der Besen zerbricht und du wirst von ihr verspeist!");
                System.out.println("Ende");
            } else if (Objects.equals(i, "c")) {
                System.out.println("Du triffst auf weitere Bedienstete und Kommilitonen. Gemeinsam wartet ihr auf Hilfe...");
                System.out.println("Ende");
            }

        } else if (Objects.equals(i, "c")) {
            System.out.println("Die Mumie zerlegt es in ihre Einzelteile, sehr gut! Allerdings kommen weitere Mumien aus den Toilettenräumlichkeiten!");
            System.out.println("Du gehst erneut zum Counter und fragst den Mitarbeiter, ob er dir weitere Munition aushändigen kann!");
            System.out.println("Er fragt, wieviel du brauchst...");
            System.out.println("x: zum beenden");

            j = Integer.parseInt(scanner.nextLine());

            if (j <= 10) {
                System.out.println("Er fragt dich, ob dir das wirklich ausreicht und zeigt dir dabei seine volle Patronenschachtel!");
                System.out.println("Was antwortest du ihm?");
                System.out.println("a: Das reicht mir, Chef!");
                System.out.println("b: OK, gib mir was du entbehren kannst!");
                System.out.println("c: Gib mir alle!");
                System.out.println("x: zum beenden");

                i = scanner.nextLine();

                if (Objects.equals(i, "a")) {
                    System.out.println("Du kämpfst gegen weitere Mumien an, welche das Gebäude betreten. Leider reicht deine Munition jetzt nichtmehr aus und wirst von ihnen verspeist!");
                    System.out.println("Ende");
                } else if (Objects.equals(i, "b")) {
                    System.out.println("Er schenkt dir die ganze Schachtel und du kannst dich nun erfolgreich gegen weiter Gefahren schützen!");
                    System.out.println("Ende");
                } else if (Objects.equals(i, "c")) {
                    System.out.println("Er schickt dich verägert weg, und du wirst von anderen Mumie verspeist, welche das Gebäude betreten!");
                    System.out.println("Ende");
                }

            } else {
                System.out.println("Er schaut dich verärgert an und fragt dich, ob du nicht etwas frech seist, so viele zu verlangen!");
                System.out.println("Möchtest du deine Forderung anpassen?");
                System.out.println("ja oder nein?");
                System.out.println("x: Beenden");

                i = scanner.nextLine();

                if (Objects.equals(i, "ja")) {
                    System.out.println("OK, wieviele möchtest du?");
                    j = Integer.parseInt(scanner.nextLine());
                    if (j <= 10) {
                        System.out.println("Sehr gut, du hast nun " + j + " Kugeln um dich vor weiteren Gefahren zu schützen.");
                        System.out.println("Ende");
                        return;
                    }
                }

                System.out.println("Er schickt dich verägert weg, und du wirst von der Mumie verspeist!");
                System.out.println("Ende");

            }
        }

        scanner.close();

    }

}
