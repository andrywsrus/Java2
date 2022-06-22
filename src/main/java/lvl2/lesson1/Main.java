package lvl2.lesson1;
public class Main {

    public static void main(String[] args) {

        Participant[] participant = new Participant[3];
        participant[0] = new Cat("Барсик",100, 4);
        participant[1] = new Human("Толик",1000, 2);
        participant[2] = new Robot("Вертер",10000, 10);

        Treadmill treadmill = new Treadmill(100);
        Wall wall = new Wall(3);

        doTraning(participant, treadmill, wall);
    }
    public static void doTraning(Participant[] participant, Treadmill treadmill, Wall wall) {
        int Stage;

        for (int i = 0; i < participant.length; i++) {
            if (participant[i].getMaxRun() < treadmill.getRun()){
                continue;
            }
            participant[i].runTreadmill(treadmill);
        }
        for (int j = 0; j < participant.length; j++) {
            if (participant[j].getMaxJump() < wall.getHeight()) {
                continue;
            }
            participant[j].jumpWall(wall);
        }
    }
}

