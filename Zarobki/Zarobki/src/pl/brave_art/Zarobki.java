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
        //Stawka [zł/godz.]    //A   15    //B   25  //C   30   //D   35
        Pracownik prac1 = new Pracownik("Janusz", "Nowak", 'B', 40);
        prac1.setTygodniowyCzasPracy(60);
        prac1.sprawdzKategorie();
        prac1.getData();

        Pracownik prac2 = new Pracownik("Grażyna", "Kowalska", 'C', 40);
        prac2.setTygodniowyCzasPracy(50);
        prac2.sprawdzKategorie();
        prac2.getData();
    }

}