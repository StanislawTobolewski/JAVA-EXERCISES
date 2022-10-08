package pl.brave_art;

import static pl.brave_art.Spoleczenstwo.getPopulacja;
import static pl.brave_art.Spoleczenstwo.sprawdzMatke;

public class Main {

    public static void main(String[] args) {

        Osoba os1 = new Osoba("Jan", "Kowalski");
        Osoba os2 = new Osoba("Janusz", "Kowalski");
        Osoba os3 = new Osoba("Grażyna", "Kowalska");
        Osoba os4 = new Osoba("Krzysztof", "Jażyna");

        os1.addOjciec(os2);
        os1.addMatka(os3);
        os4.addMatka(os3);
        System.out.println("\n=========== DANE OSOBY 1 ===========\n");

        os1.getData();

        System.out.println("\n=========== INFO O NIEZNANYCH RODZICACH 2 i 3 ===========\n");

        //System.out.println(os2.getMatka());
        System.out.println(os2.getRodzice());
        //System.out.println(os3.getOjciec());
        System.out.println(os3.getRodzice());

        System.out.println("\n=========== INFO O RODZICACH 1 ===========\n");

        System.out.println(os1.getRodzice());

        System.out.println("\n=========== TEST NA TĘ SAMĄ MATKĘ ===========\n");
        sprawdzMatke(os1);

        System.out.println("\n=========== POPULACJA ===========\n");

        getPopulacja();
    }
}
