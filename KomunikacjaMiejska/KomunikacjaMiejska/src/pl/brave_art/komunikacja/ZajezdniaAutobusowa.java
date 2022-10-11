package pl.brave_art.komunikacja;
import java.util.ArrayList;

public class ZajezdniaAutobusowa extends Zajezdnia{
    protected static ArrayList<Autobus> autobusyWZajezdni = new ArrayList<Autobus> ();
    private static double ogolneMiesieczneZuzyciePaliwa;
    public ZajezdniaAutobusowa(TYP_ZAJEZDNI zajezdnia, String nazwa){
        super(zajezdnia, nazwa);
    }
    public static void setOgolneMiesieczneZuzyciePaliwa(double ogolneMiesieczneZuzyciePaliwa) {
        ZajezdniaAutobusowa.ogolneMiesieczneZuzyciePaliwa = ZajezdniaAutobusowa.ogolneMiesieczneZuzyciePaliwa + ogolneMiesieczneZuzyciePaliwa;
    }
    @Override
    public void printData(){
        String data = "\n====== DANE ZAJEZDNI ======\n"+
                "Zajezdnia imienia: " + getNazwaZajezdni() + "\n" +
                "Typ zajezdni: " + getTypZajezdni() + "\n" +
                "Liczba zarejestrowanych autobusów: " + autobusyWZajezdni.size() + "\n" +
                "Ogólne miesięczne zużycie paliwa: " + ogolneMiesieczneZuzyciePaliwa;
        System.out.println(data);
    }
    public static void addAutobus(Autobus a){
        autobusyWZajezdni.add(a);
    }
}