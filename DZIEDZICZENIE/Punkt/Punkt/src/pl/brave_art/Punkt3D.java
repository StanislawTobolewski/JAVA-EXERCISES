package pl.brave_art;
/*
Korzystając z metod klasy Punkt i składni super, dopisz do klasy Punkt3D:
1. konstruktor bezargumentowy,
2. konstruktor przyjmujący trzy argumenty typu int,
3. konstruktor przyjmujący parametr typu Punkt i parametr typu int,
4. konstruktor przyjmujący parametr typu Punkt3D,
5. metodę void wyswietl(); - wypisującą wartości trzech współrzędnych,
przesłaniającą metodę o tej samej nazwie z klasy Punkt,
6. metodę zwracającą wartość pola z.
 */
public class Punkt3D extends Punkt{
    int z = 1;

    Punkt3D(){} //Konstruktor bezargumentowy
    Punkt3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Punkt3D(Punkt p, int z){
        this.x = p.x;
        this.y = p.y;
        this.z = z;
    }

    Punkt3D(Punkt3D p3d){
        this.x = p3d.pobierzX();
        this.y = p3d.pobierzY();
        this.z = p3d.z;
    }
    @Override
    void wyswietl(){
        System.out.println("Współżędna X:" + this.pobierzX()
                            + " Współżędna Y: " + this.pobierzY()
                            + " Współżędna Z: " + this.z);
    }


}
