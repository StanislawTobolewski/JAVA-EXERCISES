public class Robot {

    private String name;
    private String designation;
    private int hp = 5;
    private int x;
    private int y;
    private int direction;

    public Robot(String name, int y, int x) {
        this.name = name;
        this.x = x;
        this.y = y;
        setDirection();
        updateDesignation();
        GameEngine.addRobotToField(this);
    }

    public void setDirection(){
        this.direction = (int)(Math.random()*4);
    }

    public void updateDesignation(){
        switch (this.direction){
            case 0: //up    x
                this.designation = name.concat("^");
                break;
            case 1: //right     y
                this.designation = name.concat(">");
                break;
            case 2: //down      x
                this.designation = name.concat("V");
                break;
            case 3: //left      y
                this.designation = "<".concat(name);
                break;
        }
    }

    private boolean checkCollision(int x, int y){
        boolean collision = true;
        for(int i=0;i<GameEngine.getRobotsOnFieldSize();i++){
            if(x == GameEngine.getRobotsOnField(i).getX() && y == GameEngine.getRobotsOnField(i).getY()){
                collision = false;
                System.out.printf("Col!\n");
            }
        }
        return collision;
    }

    public void moveRobot(){
        switch (this.direction){
            case 0:     //move UP ^
                if(this.x >0){
                    this.x = this.x - 1;
                }else {
                    this.direction = 2;
                    this.x = this.x + 1;
            }
            break;
            case 1:     // move right >
                if(this.y<(BattleField.getBattlefieldSize()-1)) {
                    this.y = this.y + 1;
                }else {
                    this.direction = 3;
                    this.y = this.y -1;
                }
                break;
            case 2:     // move down V
                if(this.x<(BattleField.getBattlefieldSize()-1) ) {
                    this.x = this.x + 1;
                }else {
                    this.direction = 0;
                    this.x = this.x - 1;
                }
                break;
            case 3:     //move left <
                if(this.y>0 ) {
                    this.y = this.y - 1;
                }else {
                    this.direction = 1;
                    this.y = this.y + 1;
                }
                break;
        }
    }

    public void laserShoot(Robot shooter) {
        for (int i = 0; i < GameEngine.getRobotsOnFieldSize(); i++) {
            if(!shooter.equals(GameEngine.getRobotsOnField(i))){
            switch (shooter.direction) {
                case 0:
                    if (shooter.getY() == GameEngine.getRobotsOnField(i).getY() && shooter.getX() > GameEngine.getRobotsOnField(i).getX()) {
                        GameEngine.getRobotsOnField(i).decreaseHp();
                        shooter.markHit(GameEngine.getRobotsOnField(i), shooter);
                        break;
                    }
                case 1:
                    if (shooter.getX() == GameEngine.getRobotsOnField(i).getX() && shooter.getY() < GameEngine.getRobotsOnField(i).getY()) {
                        GameEngine.getRobotsOnField(i).decreaseHp();
                        shooter.markHit(GameEngine.getRobotsOnField(i),shooter);
                        break;
                    }
                case 2:
                    if (shooter.getY() == GameEngine.getRobotsOnField(i).getY() && shooter.getX() < GameEngine.getRobotsOnField(i).getX()) {
                        GameEngine.getRobotsOnField(i).decreaseHp();
                        shooter.markHit(GameEngine.getRobotsOnField(i), shooter);
                        break;
                    }
                case 3:
                    if (shooter.getX() == GameEngine.getRobotsOnField(i).getX() && shooter.getY() > GameEngine.getRobotsOnField(i).getY()) {
                        GameEngine.getRobotsOnField(i).decreaseHp();
                        shooter.markHit(GameEngine.getRobotsOnField(i), shooter);
                        break;
                    }
            }
        } else {
                break;
            }
    }
    }

    public void decreaseHp() {
        this.hp = this.hp-1;
    }

    private void markHit(Robot enemy, Robot shooter){
        System.out.printf(enemy.name + " hit by " + shooter.name + "\n");
    }

//======================== GETTERS =======================
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String getDesignation(){
        return designation;
    }
    public int getDirection(){
        return this.direction;
    }
    public int getHp(){
        return hp;
    }
    public String getName(){
        return this.name;
    }
//========================= SETTERS ======================



}
