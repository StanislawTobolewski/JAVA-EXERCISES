package pl.brave_art;

public class Taxi extends Car{

    private float[] zarobki = new float[] {2300,2500,2200,2400,2100,2500,2400,2600,2200,2300,2400,2500};

    float srZarobki(){
        float srednia = 0;
        for (int i = 0; i < zarobki.length; i++)
        {
            srednia = srednia + zarobki[i];
        }
        return (srednia/zarobki.length);
    }
}
