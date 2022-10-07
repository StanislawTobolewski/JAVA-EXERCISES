package pl.brave_art;

public class Car {

    private float[] przebieg = new float[]{500,850,1240,1825,2310,2490,2860,3190,3476,3845,4125,4732};

    float srPrzebieg() {
        float srednia = 0;
        for (int i = 0; i < przebieg.length; i++)
        {
            srednia = srednia + przebieg[i];
        }
        return (srednia/przebieg.length);
    }
}
