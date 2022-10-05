package pl.brave_art;

public class Firma {
    private String nazwa;
    private int NIP;

    Firma(String nazwa, int NIP) {
        this.nazwa = nazwa;
        this.NIP = NIP;
    }
    public void sprawdzKategorie(Pracownik p) {
        switch (p.getKategoria()) {
            case 'A': {
                p.setStawka(15);
                obliczWynagrodzenieBrutto(p);
                break;
            }
            case 'B': {
                p.setStawka(25);
                obliczWynagrodzenieBrutto(p);
                break;
            }
            case 'C': {
                p.setStawka(30);
                obliczWynagrodzenieBrutto(p);
                break;
            }
            case 'D': {
                p.setStawka(35);
                obliczWynagrodzenieBrutto(p);
                break;
            }
            default: {
                System.out.println("Brak podanej kategorii.");
            }
        }
    }
    private double podstawa(int czasPracy, int stawka, Pracownik p) {
        double podstawa = (czasPracy - (czasPracy - p.getNormaCzasuPracy())) * stawka;
        return podstawa;
    }
    protected void obliczWynagrodzenieBrutto(Pracownik p) {
        int stawka = p.getStawka();
        if (p.getTygodniowyCzasPracy() <= p.getNormaCzasuPracy()) {
            p.setWynagrodzenieBrutto(podstawa(p.getTygodniowyCzasPracy(), stawka, p));
        } else if (p.getTygodniowyCzasPracy() > p.getNormaCzasuPracy()) {
            double tempCalc = podstawa(p.getTygodniowyCzasPracy(), stawka, p) + (((p.getTygodniowyCzasPracy() - p.getNormaCzasuPracy()) * stawka) * 2);
            p.setWynagrodzenieBrutto(tempCalc);
        }
        obliczWynagrodzenieNetto(p);
    }
    //----------------------METODA OBLICZAJĄCA WYNAGRODZENIE NETTO NA PODSTAWIE BRUTTO ------------------------
    /*Podatek od zarobku jest obliczany według następującej tabeli:
      Zarobek         Stopa procentowa podatku
      ≤ 700           15%
      700 − 1200      20%
      > 1200          25%*/
    private void obliczWynagrodzenieNetto(Pracownik p) {
        double tempCalc;

        if (p.getWynagrodzenieBrutto() <= p.IProgPodatkowy) {
            //System.out.println("Podatek 15%");
            tempCalc = (p.getWynagrodzenieBrutto() - (p.getWynagrodzenieBrutto() * p.podatek_I));
            p.setWynagrodzenieNetto(tempCalc);
        } else if ((p.getWynagrodzenieBrutto() > p.IProgPodatkowy && p.getWynagrodzenieBrutto() <= p.IIProgPodatkowy)) {
            //System.out.println("Podatek 20%");
            tempCalc = (p.getWynagrodzenieBrutto() - (p.getWynagrodzenieBrutto() * p.podatek_II));
            p.setWynagrodzenieNetto(tempCalc);
        } else if (p.getWynagrodzenieBrutto() > p.IIProgPodatkowy) {
            //System.out.println("Podatek 25%");
            tempCalc = (p.getWynagrodzenieBrutto() - (p.getWynagrodzenieBrutto() * (p.podatek_III)));
            p.setWynagrodzenieNetto(tempCalc);
        }
    }
}

