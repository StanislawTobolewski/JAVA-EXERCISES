package pl.brave_art;

public class Zespolona extends Liczba {

    int liczbaZespolona;


    //Implementacja ciała metod abstrakcyjnych z klasy Liczba
    //Każda z klas potomnych może definiować własne ciało danje metody.
    public void wczytaj(int x){
        this.liczbaZespolona = x;
    }
    public void wyswietl(){
        System.out.println("Liczba rzeczywsita: " + this.liczbaZespolona);
    }
    public int obliczKwadrat(int x){
        return (int) Math.pow(x,2);
    }

}
