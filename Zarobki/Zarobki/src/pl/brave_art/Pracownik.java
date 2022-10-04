package pl.brave_art;

public class Pracownik {

    private final int I_PROG_PODATKOWY = 700;
    private final int II_PROG_PODATKOWY = 1200;
    private String imie="";
    private String nazwisko="";
    private char kategoria;
    private int stawka;
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
    public char getKategoria(){
        return this.kategoria;
    }
    public double getWynagrodzenieBrutto(){
        return this.wynagrodzenieBrutto;
    }
    public double getWynagrodzenieNetto(){
        return this.wynagrodzenieNetto;
    }
    public double getPodatek(){
        return (this.getWynagrodzenieBrutto()-this.getWynagrodzenieNetto());
    }
    public void getData(){
        System.out.println("Dane pracownika:");
        System.out.println("Imię: " + this.imie + " Nazwisko: " + this.nazwisko);
        System.out.println("Kategoria: " + this.kategoria);
        System.out.println("Czas pracy podstawa: " + (this.tygodniowyCzasPracy-(this.tygodniowyCzasPracy- normaCzasuPracy)) + " Nadgodziny: " + (this.tygodniowyCzasPracy- normaCzasuPracy));
        System.out.println("Wynagrodzenie brutto:" + getWynagrodzenieBrutto() + " zł.");
        System.out.println("Podatek: " + getPodatek() + " zł.");
        System.out.println("Wynagrodzenie netto: " + getWynagrodzenieNetto() + " zł.");
    }

    public void setStawka(int stawka){
        this.stawka = stawka;
    }

    public int getStawka() {
        return stawka;
    }

    public void setKategoria(char a){
        this.kategoria = a;
    }
    public void setTygodniowyCzasPracy(int t){
        this.tygodniowyCzasPracy = t;
    }

    //----------------------METODA OBLICZAJĄCA WYNAGRODZENIE BRUTO NA PODSTAWIE STAWKI GODZINOWEJ (Z METODY SPRAWDZ KATEGORIE) ------------------------
    private void obliczWynagrodzenieBrutto()
    {
        int stawka = this.getStawka();
        if(this.tygodniowyCzasPracy<=this.normaCzasuPracy)
        {
            this.wynagrodzenieBrutto = podstawa(this.tygodniowyCzasPracy, stawka);
        } else if (this.tygodniowyCzasPracy>this.normaCzasuPracy)
        {
            this.wynagrodzenieBrutto = podstawa(this.tygodniowyCzasPracy, stawka) + (((this.tygodniowyCzasPracy-this.normaCzasuPracy)*stawka)*2);
        }
        obliczWynagrodzenieNetto();
    }
    //----------------------METODA OBLICZAJĄCA WYNAGRODZENIE NETTO NA PODSTAWIE BRUTTO ------------------------
    /*Podatek od zarobku jest obliczany według następującej tabeli:
Zarobek         Stopa procentowa podatku
≤ 700           15%
700 − 1200      20%
> 1200          25% */
    private void obliczWynagrodzenieNetto()
    {
        double wynagrodzenieNetto = 0;
        if(this.wynagrodzenieBrutto<=I_PROG_PODATKOWY)
        {
            System.out.println("Podatek 15%");
            wynagrodzenieNetto = (this.wynagrodzenieBrutto-(this.wynagrodzenieBrutto*0.15));
        } else if ((this.wynagrodzenieBrutto>I_PROG_PODATKOWY&&this.wynagrodzenieBrutto<=II_PROG_PODATKOWY))
        {
            System.out.println("Podatek 20%");
            wynagrodzenieNetto = (this.wynagrodzenieBrutto-(this.wynagrodzenieBrutto*0.20));
        } else if (this.wynagrodzenieBrutto>II_PROG_PODATKOWY)
        {
            System.out.println("Podatek 25%");
            wynagrodzenieNetto = (this.wynagrodzenieBrutto-(this.wynagrodzenieBrutto*0.25));
        }
        this.wynagrodzenieNetto=wynagrodzenieNetto;
    }
    private double podstawa(int czasPracy, int stawka){
        double podstawa = (czasPracy-(czasPracy-this.normaCzasuPracy))*stawka;
        return podstawa;
    }
    public void sprawdzKategorie()
    {
        switch (this.kategoria){
            case 'A':{
                this.setStawka(15);
                obliczWynagrodzenieBrutto();
                break;
            }
            case 'B':{
                this.setStawka(25);
                obliczWynagrodzenieBrutto();
                break;
            }
            case  'C':{
                this.setStawka(30);
                obliczWynagrodzenieBrutto();
                break;
            }
            case 'D':{
                this.setStawka(35);
                obliczWynagrodzenieBrutto();
                break;
            }
            default:{
                System.out.println("Brak podanej kategorii.");
            }
        }
    }
}