package pl.brave_art.komunikacja;

public class Tramwaj extends Pojazd{

    private byte iloscWagonow;

    Tramwaj(int vmax, TYP_POJAZDU typPojazdu, String numer, ZajezdniaTramwajowa zajezdnia, byte iloscWagonow){
        super(vmax, typPojazdu, numer, zajezdnia);
        this.iloscWagonow = iloscWagonow;
        ZajezdniaTramwajowa.setOgolnaIloscWagonow(iloscWagonow);
        ZajezdniaTramwajowa.addTramwaj(this);
    }
    @Override
    public void podajOpis()
    {
        String opis = "\n====DANE SZCZEGÓŁOWE TRAMWAJU====\n" +
                "Typ pojazdu: " + typPojazdu + "\n" +
                "Numer pojazdu: " + numer + "\n" +
                "Prędkość max: " + V_MAX + " km/h\n" +
                "Zajezdnia pojazdu: " + zajezdnia.getTypZajezdni() + "\n" +
                "Nazwa zajezdni: " + zajezdnia.getNazwaZajezdni() + "\n" +
                "Ilość wagonów w składzie: " + iloscWagonow;
        System.out.println(opis);
    }
}