package pl.brave_art.komunikacja;

/*
Laboratorium z programowania obiektowego
23.03.2011 r.
Zaprojektuj hierarchię klas opisujących pojazdy komunikacji miejskiej. Wyraź w tej hie- rarchii następujące fakty:
• wszystkie pojazdy komunikacji miejskiej (k. m.) są pojazdami,
• komunikacja miejska używa tramwajów i autobusów,
• pojazdy są garażowane w zajezdniach, odpowiednio tramwajowych i autobusowych,
• każdy pojazd zna swoją szybkość maksymalną,
• każdy pojazd k. m. zna swój numer,
• każdy pojazd k. m. zna swoją zajezdnię,
• każdy tramwaj jest zestawem 1 do 3 wagonów (i wie, z ilu wagonów się składa),
• każdy autobus wie, ile zużył paliwa w bieżącym miesiącu,
• każda zajezdnia zna swoją nazwę,
• każda zajezdnia wie, jakie pojazdy do niej należą,
• każda zajezdnia ma nazwę.
Każdy pojazd musi umieć podać swój opis w postaci napisu. Opis ma zawierać wszystkie informacje,
które zna dany pojazd (np. numer, czy szybkość maksymalną). Opis zajezdni to nazwa zajezdni,
jej typ i opisy poszczególnych pojazdów. Zajezdnia autobusowa podaje dodatkowo sumaryczne zużycie paliwa
w bieżącym miesiącu, a tramwajowa ogólną liczbę wagonów.
Napisz program w Javie, który utworzy kilka obiektów reprezentujących różne pojazdy i dwie zajezdnie
(autobusową i tramwajową), przydzieli pojazdy do zajezdni, a następnie wypisze opis obu zajezdni.
 */

public class KomunikacjaMain {

    public static void main(String[] args) {

        ZajezdniaAutobusowa zajAutobusowa1 = new ZajezdniaAutobusowa(TYP_ZAJEZDNI.AUTOBUSOWA, "Zajezdnia imienia Kowalskiego.");
        ZajezdniaTramwajowa zajTramwajowa1 = new ZajezdniaTramwajowa(TYP_ZAJEZDNI.TRAMWAJOWA, "Zajezdnia imienia Nowaka.");


        Autobus bus1 = new Autobus(180, TYP_POJAZDU.AUTOBUS, "PZ BUS01", zajAutobusowa1, 250.75);
        Autobus bus2 = new Autobus(190, TYP_POJAZDU.AUTOBUS, "PZ BUS02", zajAutobusowa1, 210.75);
        Autobus bus3 = new Autobus(170, TYP_POJAZDU.AUTOBUS, "PZ BUS03", zajAutobusowa1, 270.75);

        Tramwaj tramwaj1 = new Tramwaj(110, TYP_POJAZDU.TRAMWAJ, "PZ TRAM01", zajTramwajowa1, (byte)3);
        Tramwaj tramwaj2 = new Tramwaj(110, TYP_POJAZDU.TRAMWAJ, "PZ TRAM02", zajTramwajowa1, (byte)1);

        bus1.podajOpis();
        bus3.podajOpis();
        tramwaj1.podajOpis();
        zajTramwajowa1.printData();
        zajAutobusowa1.printData();

    }
}
