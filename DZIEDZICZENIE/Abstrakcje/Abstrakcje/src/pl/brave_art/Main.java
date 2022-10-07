package pl.brave_art;

/*
Zdefiniuj klasę bazową Liczba, w której znajdą się metody abstrakcyjne wczytaj - nadająca wartość (np. losową) liczbie,
wyswietl - wyświetlająca liczbę
obliczKwadrat - obliczająca kwadrat liczby. (dla uproszczenia obliczam potę©ę podanej liczby).
Utwórz klasy Rzeczywista i Zespolona dziedziczące po klasie Liczba.
Do klas pochodnych wprowadź odpowiednie pola reprezentujące wartości tych liczb.
 */

public class Main {

    public static void main(String[] args) {
        Rzeczywista r = new Rzeczywista();
        r.wczytaj(6);
        r.wyswietl();
        System.out.println("Kwadrat liczby rzeczywsitej: " + r.obliczKwadrat(r.liczbaRzeczywsita));

        Zespolona z = new Zespolona();
        z.wczytaj(4);
        z.wyswietl();
        System.out.println("Kwadrat liczby zespolonej: " + r.obliczKwadrat(z.liczbaZespolona));

    }
}
