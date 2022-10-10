package pl.brave_art.komunikacja;

public abstract class Pojazd {

    protected int V_MAX;
    protected TYP_POJAZDU typPojazdu;
    protected String numer;
    protected Zajezdnia zajezdnia;
    public Pojazd(int v_MAX, TYP_POJAZDU typPojazdu, String numer, Zajezdnia zajezdnia) {
        V_MAX = v_MAX;
        this.typPojazdu = typPojazdu;
        this.numer = numer;
        this.zajezdnia = zajezdnia;
    }
    abstract void podajOpis();
}
