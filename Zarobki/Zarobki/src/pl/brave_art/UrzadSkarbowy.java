package pl.brave_art;

public class UrzadSkarbowy {

    private String nazwa;
    private String adres;
    private String kodPocztowy;

    UrzadSkarbowy(String nazwa, String adres, String kodPocztowy){
        this.nazwa = nazwa;
        this.adres = adres;
        this.kodPocztowy = kodPocztowy;
    }

    public void zmienIProgPodatkowy(Pracownik p, int kwota){
        p.IProgPodatkowy = kwota;
    }
    public void zmienIIProgPodatkowy(Pracownik p, int kwota){
        p.IIProgPodatkowy = kwota;
    }
    public void zmienPodatki(Pracownik p, double p1, double p2, double p3){
        p.podatek_I=p1;
        p.podatek_II=p2;
        p.podatek_III=p3;
    }


}
