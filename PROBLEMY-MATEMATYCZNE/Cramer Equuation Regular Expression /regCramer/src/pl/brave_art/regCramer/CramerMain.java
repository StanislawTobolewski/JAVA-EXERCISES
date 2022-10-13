package pl.brave_art.regCramer;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CramerMain {
    public static void main(String[] args) {

        int x1 = 0,y1 = 0,z1 = 0;
        int x2 = 0,y2 = 0,z2 = 0;
        double detA; // - wyznaczniik macieży głównej;
        double detAx1;
        double detAy1;
        double X, Y;

        String regex = "(?<x1>-{0,1}\\d*)\\s*[xX]{0,1}\\s*(?<y1>[+,-]\\s*\\d*)\\s*[yY]\\s*[=]\\s*(?<z1>\\d*)\\n*?";
        Matcher matcher;
        String equation;

        Pattern pat = Pattern.compile(regex, Pattern.COMMENTS);

        Scanner s = new Scanner(System.in);
        System.out.println("Podaj pierwsze równanie w formacie ax + by = c");

        try {

            equation = s.nextLine();
            matcher = pat.matcher(equation);

            if (matcher.matches()) {
                wczytanoRownanie();
                x1 = signValue(matcher, "x1");
                y1 = signValue(matcher, "y1");
                z1 = signValue(matcher, "z1");
            }
            System.out.println("Podaj drugie równanie w formacie ax + by = c");
            equation = s.nextLine();

            matcher = pat.matcher(equation);

            if (matcher.matches()) {
                x2 = signValue(matcher, "x1");
                y2 = signValue(matcher, "y1");
                z2 = signValue(matcher, "z1");
                wczytanoRownanie();
            }

            System.out.println("Krok pierwszy: Obliczam wyznacznik macieży 2 x 2 ...");
            detA = (x1 * y2) - (x2 * y1);
            System.out.println("Wzynacznik macieży 2 x 2 = " + detA);

            if (detA == 0) {
                System.out.println("Wyznacznik jest równy zero, układ równanń nie jest układem Cramera");
            } else {
                System.out.println("Wyznacznik jest różny od zera więc nasz układ jest układem Cramera.");

                detAx1 = (z1 * y2) - (z2 * y1);
                detAy1 = (x1 * z2) - (x2 * z1);

                X = (detAx1 / detA);
                Y = (detAy1 / detA);

                System.out.println("Wykresy funkcji przetną sie w punkcie (x,y): (" + X + ", " + Y + ")");
            }
        }catch (ArithmeticException e){
            System.out.println("Podano nieprawidłowe równania");
        }
        catch (Exception e){
            System.out.println("Coś poszło nie tak");
        }
    }
    public static void wczytanoRownanie(){
        System.out.println("Równanie wczytane pomyślnie");
    }

    public static int signValue(Matcher m, String group){
        return Integer.parseInt(m.group(group));
    }
}
