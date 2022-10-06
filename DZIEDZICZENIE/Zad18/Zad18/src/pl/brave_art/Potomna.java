package pl.brave_art;

public class Potomna extends Bazowa{
    int liczba = 1;

    Potomna(){}

    protected int pobierzWartość(boolean bool) {
        return (bool) ? this.liczba : super.liczba;
    }
    protected void ustawWartosc(int w, boolean test){
        if(test){this.liczba = w;}
        else {super.liczba = w;}
    }

}
