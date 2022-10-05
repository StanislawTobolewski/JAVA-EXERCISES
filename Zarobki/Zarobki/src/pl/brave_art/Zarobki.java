package pl.brave_art;
/*
Napisz program obliczający tygodniowe zarobki brutto i netto pracownika, gdy znana jest jego kategoria zaszeregowania
i liczba przepracowanych godzin w ciągu tygodnia. Wykorzystaj instrukcję switch.
Dla poszczególnych kategorii zaszeregowania obowiązują następujące stawki:

Kategoria zaszeregowania
Stawka [zł/godz.]
A   15
B   25
C   30
D   35
Jeśli pracownik przepracuje więcej niż 40 godzin w ciągu tygodnia, zapłata za każdą nadgodzinę jest dwukrotnie wyższa od stawki pracownika.
Podatek od zarobku jest obliczany według następującej tabeli:

Zarobek         Stopa procentowa podatku
≤ 700           15%
700 − 1200      20%
> 1200          25% */
public class Zarobki {

    public static void main(String[] args) {

        Firma firma1 = new Firma("Porąbana", 1111111111);

        //Stawka [zł/godz.]    //A   15    //B   25  //C   30   //D   35
        Pracownik prac1 = new Pracownik("Janusz", "Nowak", 'B', 40);
        prac1.setTygodniowyCzasPracy(60);
        firma1.sprawdzKategorie(prac1);
        firma1.obliczWynagrodzenieBrutto(prac1);
        prac1.getData();

        System.out.printf("\n\n-------------------URZĄD SKARBOWY próg podatkowy 2000----------------------\n\n");

        UrzadSkarbowy US = new UrzadSkarbowy("I Urząd Skarbowy", "ul. długa 45, Bąbolewo", "32-891");
        US.zmienIIProgPodatkowy(prac1, 2000);
        firma1.obliczWynagrodzenieBrutto(prac1);
        prac1.getData();

        System.out.printf("\n\n-------------------ZMIANA PROGU PODATKOWEGO zmiana kate zarobkowej -> A 15/h ----------------------\n\n");

        Pracodawca p = new Pracodawca();

        p.zmienKategorie(prac1,'A');
        firma1.sprawdzKategorie(prac1);
        firma1.obliczWynagrodzenieBrutto(prac1);
        prac1.getData();

    }

}