package pl.brave_art;

public class Rzeczywista extends Liczba {

    int liczbaRzeczywsita;

    //Implementacja ciała metod abstrakcyjnych z klasy Liczba.
    //Każda z klas potomnych może definiować własne ciało danje metody.

    public void wczytaj(int x){
        this.liczbaRzeczywsita = x;
    }
    public void wyswietl(){
        System.out.println("Liczba rzeczywsita: " + this.liczbaRzeczywsita);
    }
    public int obliczKwadrat(int x){
        return (int) Math.pow(x,2);
    }


}
