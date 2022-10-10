package pl.brave_art.komunikacja;

public abstract class Zajezdnia {

    private TYP_ZAJEZDNI typZajezdni;
    private String nazwaZajezdni;
    Zajezdnia(TYP_ZAJEZDNI typZajezdni, String nazwa)
    {
        this.typZajezdni = typZajezdni;
        this.nazwaZajezdni = nazwa;
    }
    public abstract void printData();
    public String getNazwaZajezdni(){
        return nazwaZajezdni;
    }
    public String getTypZajezdni() {
        return typZajezdni.toString();
    }
}