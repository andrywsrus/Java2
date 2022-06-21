package lvl2.lesson1;

public class Robot extends Participant {

    public Robot(String name, int maxRun, int maxJump) {
        super(name, maxRun, maxJump);
    }


    @Override
    public void runTreadmill(Treadmill treadmill) {
        if (treadmill.getRun() <= getMaxRun() )
            System.out.println("Робот " + getName() + " пробежал " + treadmill.getRun() + " метров" );
        else System.out.println("Робот " + getName() + " не смог пробежать " + treadmill.getRun() + " метров");
    }

    @Override
    public void jumpWall(Wall wall) {
        if (wall.getHeight() <= getMaxJump())
            System.out.println("Робот " + getName() + " перепрыгнул стену высотой " + wall.getHeight() + " метра");
        else System.out.println("Робот " + getName() + " не смог перепрыгнуть стену высотой " + wall.getHeight() + " метра");
    }
}
