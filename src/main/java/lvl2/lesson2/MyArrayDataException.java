package lvl2.lesson2;

public class MyArrayDataException extends MyException {

    public MyArrayDataException(int x, int y){
        super("В индексе [" + (x) + "][" + (y) + "] массива не число");
    }
}