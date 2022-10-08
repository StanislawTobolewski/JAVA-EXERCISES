package pl.brave_art;

import java.util.ArrayList;
import java.util.List;

public class Spoleczenstwo {

    private static List<Osoba> populacja = new ArrayList<Osoba>();

    public void addPopulacja(Osoba osoba){
        populacja.add(osoba);
    }

    public static void getPopulacja(){
        for (int i = 0; i< populacja.size();i++){
            System.out.println(getData(populacja.get(i)));
        }
    }

    private static String getData(Osoba o){
        String outputData = "Imie: " + o.getImie() + ", Nazwisko: " + o.getNazwisko();
        return outputData;
    }

    public static void sprawdzMatke(Osoba os)
    {
        for(int i=0;i< populacja.size();i++)
        {
            if(os.getMatka().equals(populacja.get(i).getMatka())&&!os.equals(populacja.get(i)))
            {
                String output = os.getImie() + " " + os.getNazwisko() + " i " + populacja.get(i).getImie() + " " + populacja.get(i).getNazwisko() + " Mają tę samą matkę";
                System.out.println(output);
            }
        }
    }


}
