import java.util.List;

public class BattleField {

    private static int battlefieldSize = 6;
    private static String battlefieldArray[][] = new String[battlefieldSize][battlefieldSize];

    BattleField(int size){
        battlefieldSize = size;
    }

    public static void createBattlefield() {
        for (int i = 0; i < battlefieldSize; i++) {
            for (int j = 0; j < battlefieldSize; j++) {
                battlefieldArray[i][j] = "\t*\t";
            }
        }
        System.out.printf("\n");
        addRobotToBattlefield();
    }

    public static void addRobotToBattlefield(){
        for(int i=0;i<GameEngine.robotsOnField.size();i++){
            int x,y;
            x = GameEngine.getRobotsOnField(i).getX();
            y = GameEngine.getRobotsOnField(i).getY();
            battlefieldArray[x][y] = "\t" + GameEngine.getRobotsOnField(i).getDesignation().concat("\t");
        }
    }

    public static void printBattlefield(){
        createBattlefield();
        for(int i=0;i<battlefieldSize;i++){
            for (int j=0;j<battlefieldSize;j++){
                System.out.printf(battlefieldArray[i][j]);
            }
            System.out.printf("\n");
        }
    }

    public static int getBattlefieldSize(){
        return battlefieldSize;
    }

}