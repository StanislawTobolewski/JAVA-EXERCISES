package pl.brave_art;
/*
Do klasy Potomna z poprzedniego zadania dopisz metodę ustawWartosc przyjmującą dwa argumenty: pierwszy typu int, drugi typu boolean.
Jeśli wartością drugiego argumentu będzie
- true: wartość pierwszego przypisz polu liczba zdefiniowanemu w Potomna,
- false: wartość pierwszego przypisz polu liczba zdefiniowanemu w klasie Bazowa.
W klasie Main i metodzie main utwórz obiekt klasy Potomna i wywołaj metodę ustawWartosc.
 */
public class Main {

    public static void main(String[] args) {
        Potomna p = new Potomna();
        System.out.println("Liczba: " + p.pobierzWartość(true));
        p.ustawWartosc(5,true);
        System.out.println("Liczba: " + p.pobierzWartość(true));

    }
}
