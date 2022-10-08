package pl.brave_art;

public class Osoba extends Spoleczenstwo{

    private String imie;
    private String nazwisko;
    private Osoba ojciec = null;
    private Osoba matka = null;

    Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        super.addPopulacja(this);

    }

    public void addMatka(Osoba matka){
        this.matka = matka;
    }

    public void addOjciec(Osoba ojciec){
        this.ojciec = ojciec;
    }

    public String getImie(){
        return this.imie;
    }

    public String getNazwisko(){
        return this.nazwisko;
    }

    public String getMatka(){
        String outputData;
        if(this.matka==null){
            outputData = "Matka nieznana";
        } else {
            outputData = "DANE MATKI:___________ \nImię: " + matka.imie +
                    "\nNazwisko: " + matka.nazwisko;
        }
        return outputData;
    }

    public String getOjciec(){
        String outputData;
        if(this.ojciec==null){
            outputData = "Ojciec nieznany";
        } else {
            outputData = "DANE OJCA:___________ \nImię: " + ojciec.imie +
                    "\nNazwisko: " + ojciec.nazwisko;
        }
        return outputData;
    }

    public String getRodzice(){
        String outputOjciecData, outputMatkaData;
        if(this.ojciec==null){
            outputOjciecData = "Ojciec nieznany";
        } else {
            outputOjciecData = "DANE OJCA:___________ \nImię: " + ojciec.imie +
                    "\nNazwisko: " + ojciec.nazwisko;
        }

        if(this.matka==null){
            outputMatkaData = "Matka nieznana";
        } else {
            outputMatkaData = "DANE MATKI:___________ \nImię: " + matka.imie +
                    "\nNazwisko: " + matka.nazwisko;
        }
        String personalData = "Imię: " + this.imie + ", Nazwisko: " + this.nazwisko + "\n";
        return personalData + outputOjciecData + "\n" + outputMatkaData;
    }



    public void getData(){
        System.out.println("Imię: " + this.imie);
        System.out.println("Nazwisko: " + this.nazwisko);
    }

}
