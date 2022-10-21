public class Main {
    public static void main(String[] args) {
        boolean roadObstacles[] = new boolean[]{false, false, false, false, true, false, false, true, false, false};
        moveCar(roadObstacles);
    }
    public static void moveCar(boolean[] roadObstacles) {
        var arrayLength = roadObstacles.length;
        var pasikDamageCounter = 0; //count road damages.
        var pasikDamageLimit = 1;  //numebr of possible damage detections before car stop (with this value car can still drive, above that it will stop).
        var arrayContent = "Symulowane wykryte przeszkody na drodze([ ";

        System.out.println("\n\n\n================Z DROGI ŚLEDZIE================");
        System.out.println("=================PASIK JEDZIE===================");
        System.out.println("===========nie mogłem się powstrzymać===========");
        System.out.println("\n\nZałożenia: \nPierwsza usterka (true) - wyświetl informację o uszkodzeniu Pasika, kontynuuj jazdę \ndruga usterka (true) - wyświetl informację o zniszczeniu Pasika, zatrzymaj Pasika.\n\n");

        for(int i = 0;i<roadObstacles.length;i++){
            arrayContent = arrayContent.concat(roadObstacles[i] + " ");
        }
        System.out.println("Wartość 'false' oznacza brak wykrytej przeszkody, wartość 'true' oznacza wykrycie przeszkody.");

        System.out.printf(arrayContent + "])\n\n");
        System.out.println("Pasik wyrusza w drogę ...");

        for (int j = 0; j < arrayLength; j++) {
            if (j < (arrayLength - 1)) {
                arrayContent = arrayContent + roadObstacles[j] + ", ";
            } else if (j == (arrayLength - 1)) {
                arrayContent = arrayContent + roadObstacles[j] + "";
            }
        }
        for (int i = 0; i < arrayLength; i++) {
            if (roadObstacles[i] == true && pasikDamageCounter < pasikDamageLimit) {
                System.out.println("Pasik został uszkodzony");
                pasikDamageCounter++;
            } else if (roadObstacles[i] && pasikDamageCounter >= pasikDamageLimit) {
                System.out.println("Pasik został zniszczony, zatrzymuję pasika");
                pasikDamageCounter++;
                break;
            } else {
                System.out.println("Pasik jedzie do " + (i + 1) + " fragmentu trasy...");
            }
        }
    }
}