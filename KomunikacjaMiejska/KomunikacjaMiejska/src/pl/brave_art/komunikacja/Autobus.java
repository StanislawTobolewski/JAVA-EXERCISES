package pl.brave_art.komunikacja;

public class Autobus extends Pojazd{

    private double miesieczneZuzyciePaliwa;

    public Autobus(int v_MAX, TYP_POJAZDU typPojazdu, String numer, ZajezdniaAutobusowa zajezdnia, double miesieczneZuzyciePaliwa){
        super(v_MAX, typPojazdu, numer, zajezdnia);
        this.miesieczneZuzyciePaliwa = miesieczneZuzyciePaliwa;
        ZajezdniaAutobusowa.setOgolneMiesieczneZuzyciePaliwa(miesieczneZuzyciePaliwa);
        ZajezdniaAutobusowa.addAutobus(this);
    }

    @Override
    public void podajOpis()
    {
        String opis = "\n====DANE SZCZEGÓŁOWE AUTOBUSU====\n" +
                      "Typ pojazdu: " + typPojazdu + "\n" +
                      "Numer pojazdu: " + numer + "\n" +
                      "Prędkość max: " + V_MAX + " km/h\n" +
                      "Zajezdnia pojazdu: " + zajezdnia.getTypZajezdni() + "\n" +
                      "Nazwa zajezdni: " + zajezdnia.getNazwaZajezdni() + "\n" +
                      "Średnie miesięczne zużycie paliwa: " + miesieczneZuzyciePaliwa + " l.";
        System.out.println(opis);
    }
}
