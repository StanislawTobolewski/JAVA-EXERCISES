import java.util.ArrayList;
import java.util.List;

public class GameEngine {

    protected static List<Robot> robotsOnField = new ArrayList();
    private static boolean continueGame = true;

    Robot r1= new Robot("A",4,4);
    Robot r2= new Robot("B",0,2);
    //Robot r3= new Robot("C",4,0);
    //Robot r4= new Robot("D",1,1);

    public void runGame(){
        int game = 10;
        while(continueGame) {
            for(int i=0;i<getRobotsOnFieldSize();i++){
                GameEngine.getRobotsOnField(i).setDirection();
                System.out.printf("Set Direction: " + GameEngine.getRobotsOnField(i).getName() + " = " + GameEngine.getRobotsOnField(i).getDirection() + " ");
                GameEngine.getRobotsOnField(i).updateDesignation();
                System.out.printf("Update Direction: " + GameEngine.getRobotsOnField(i).getName() + " = " + GameEngine.getRobotsOnField(i).getDirection() + " ");
                GameEngine.getRobotsOnField(i).moveRobot();
                GameEngine.getRobotsOnField(i).laserShoot(GameEngine.getRobotsOnField(i));
                GameEngine.hpStatus();
            }
            BattleField.printBattlefield();
            checkHp();
        }
    }

    public static void hpStatus(){
        for(int i=0;i<GameEngine.getRobotsOnFieldSize();i++){
            System.out.printf(GameEngine.getRobotsOnField(i).getName() + ":" + GameEngine.getRobotsOnField(i).getHp() + "HP ");
        }
        System.out.printf("\n");
    }

    private static void checkHp(){
        for (int i=0;i<robotsOnField.size();i++){
            if(robotsOnField.get(i).getHp()==0){
                continueGame = false;
            }
        }
    }
    public static int getRobotsOnFieldSize(){
        return robotsOnField.size();
    }
    public static void addRobotToField(Robot r){
        robotsOnField.add(r);
    }
    public static Robot getRobotsOnField(int i){
        return robotsOnField.get(i);
    }

}
