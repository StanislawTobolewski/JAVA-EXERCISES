package pl.brave_art.komunikacja;
import java.util.ArrayList;

public class ZajezdniaTramwajowa extends Zajezdnia{

    protected static ArrayList <Tramwaj> tramwajeWZajezdni = new ArrayList<Tramwaj> ();
    private static int ogolnaIloscWagonow;
    public ZajezdniaTramwajowa(TYP_ZAJEZDNI typZajezdni, String nazwa){
        super(typZajezdni, nazwa);
    }
    public static void setOgolnaIloscWagonow(int ogolnaIloscWagonow) {
        ZajezdniaTramwajowa.ogolnaIloscWagonow = ZajezdniaTramwajowa.ogolnaIloscWagonow + ogolnaIloscWagonow;
    }
    public void printData(){
        String data = "\n====== DANE ZAJEZDNI ======\n"+
                      "Zajezdnia imienia: " + getNazwaZajezdni() + "\n" +
                      "Typ zajezdni: " + getTypZajezdni() + "\n" +
                      "Liczba zarejestrowanych tramwai: " + tramwajeWZajezdni.size() + "\n" +
                      "Sumaryczna ilość wagonów: " + ogolnaIloscWagonow;
        System.out.println(data);
    }
    public static void addTramwaj(Tramwaj a){
        tramwajeWZajezdni.add(a);
    }
}