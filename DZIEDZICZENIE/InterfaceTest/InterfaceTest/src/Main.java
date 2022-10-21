import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //GraphicDesigner gd = new GraphicDesigner("Andźej", "Nowak", 123);
        //Printer pr = new Printer("Janusz", "Kowalski", 345);
        //MarketingSpecialist ms = new MarketingSpecialist("Marian", "Korba", 589);

        int test = 1;

        Weeirdo w1 = new Weeirdo("Jan", "Nowak", LocalDate.of(1986,3,6));

        Worker worker = null;

        switch (test){
            case 1:{
                worker = new GraphicDesigner("Andźej", "Nowak", 123);
            }
            case 2:{
                worker = new GraphicDesigner("Andźej", "Nowak", 123);
            }
            case 3:{
                worker = new GraphicDesigner("Andźej", "Nowak", 123);
            }
            default:{
                if(worker==null)
                {
                    System.out.printf("Error");
                }else{
                    System.out.printf("Worker data: " + worker.getData());
                    System.out.printf("\nTO ŻYJE :O");
                }
            }
        }
    }
}