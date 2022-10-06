package pl.brave_art;

public class Main {

    public static void main(String[] args) {

        Punkt p = new Punkt();
        Punkt p2 = new Punkt(2,3);
        Punkt p3 = new Punkt(p2);

        System.out.println("=============Test Klasy Punkt =================");

        p.wyswietl();
        p2.wyswietl();
        p3.wyswietl();

        System.out.println("=============Test Klasy Punkt 3D ==============");

        Punkt3D p3d = new Punkt3D();
        Punkt3D p3d_2 = new Punkt3D(3,4,5);
        Punkt3D p3d_3 = new Punkt3D(p,9);
        Punkt3D p3d_4 = new Punkt3D(p3d);

        p3d.wyswietl();
        p3d_2.wyswietl();
        p3d_3.wyswietl();
        p3d.wyswietl();


    }
}
