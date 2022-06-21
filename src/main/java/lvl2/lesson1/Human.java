package lvl2.lesson1;

public class Human extends Participant {

    public Human(String name, int maxRange, int maxJump) {
        super(name, maxRange, maxJump);
    }


    @Override
    public void runTreadmill(Treadmill treadmill) {
        if (treadmill.getRun() <= getMaxRun() )
            System.out.println("Человек " + getName() + " пробежал " + treadmill.getRun() + " метров" );
        else System.out.println("Человек " + getName() + " не смог пробежать " + treadmill.getRun() + " метров");
    }

    @Override
    public void jumpWall(Wall wall) {
        if (wall.getHeight() <= getMaxJump())
            System.out.println("Человек " + getName() + " перепрыгнул стену высотой " + wall.getHeight() + " метра");
        else System.out.println("Человек " + getName() + " не смог перепрыгнуть стену ");
    }
}
