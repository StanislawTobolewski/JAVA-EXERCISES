package pl.brave_art;

public class Potomna extends Bazowa{
    int liczba = 1;

    Potomna(){}

    protected int pobierzWartość(boolean bool){
        return (bool) ? this.liczba : super.liczba;
        }

}
