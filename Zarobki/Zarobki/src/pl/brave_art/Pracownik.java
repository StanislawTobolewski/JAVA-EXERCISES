package pl.brave_art;

public class Pracownik {

    protected int IProgPodatkowy = 700;
    protected int IIProgPodatkowy = 1200;
    protected double podatek_I = 0.15;
    protected double podatek_II = 0.20;
    protected double podatek_III = 0.25;

    private String imie="";
    private String nazwisko="";
    private char kategoria;
    protected int stawka;
    private int normaCzasuPracy;
    private int tygodniowyCzasPracy;
    private double wynagrodzenieBrutto;
    private double wynagrodzenieNetto;

    public Pracownik(String imie, String nazwisko, char kategoria, int normaCzasuPracy){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.kategoria = kategoria;
        this.normaCzasuPracy = normaCzasuPracy;
    }
    public int getTygodniowyCzasPracy(){
        return this.tygodniowyCzasPracy;
    }
    public int getNormaCzasuPracy(){return  this.normaCzasuPracy;}
    public char getKategoria(){
        return this.kategoria;
    }
    public double getWynagrodzenieBrutto(){
        return this.wynagrodzenieBrutto;
    }
    public double getWynagrodzenieNetto(){
        return this.wynagrodzenieNetto;
    }
    public int getStawka() {
        return stawka;
    }
    public double obliczPodatek(){
        return (this.getWynagrodzenieBrutto()-this.getWynagrodzenieNetto());
    }

    //------------- SETTERY ----------------------

    public void getData(){
        System.out.println("Dane pracownika:");
        System.out.println("Imię: " + this.imie + " Nazwisko: " + this.nazwisko);
        System.out.println("Kategoria: " + this.kategoria);
        System.out.println("Czas pracy podstawa: " + (this.tygodniowyCzasPracy-(this.tygodniowyCzasPracy- normaCzasuPracy)) + " Nadgodziny: " + (this.tygodniowyCzasPracy- normaCzasuPracy));
        System.out.println("Wynagrodzenie brutto:" + getWynagrodzenieBrutto() + " zł.");
        System.out.println("Podatek:" + obliczPodatek() + " zł.");
        System.out.println("Wynagrodzenie netto: " + getWynagrodzenieNetto() + " zł.");
    }
    public void setWynagrodzenieBrutto(double wBrutto){
        this.wynagrodzenieBrutto = wBrutto;
    }
    public void setWynagrodzenieNetto(double wNetto){ this.wynagrodzenieNetto = wNetto;}
    public void setStawka(int stawka){
        this.stawka = stawka;
    }
    public void setKategoria(char a){
        this.kategoria = a;
    }
    public void setTygodniowyCzasPracy(int t){
        this.tygodniowyCzasPracy = t;
    }
}