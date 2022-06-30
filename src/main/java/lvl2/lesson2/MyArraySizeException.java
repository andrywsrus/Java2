package lvl2.lesson2;

public class MyArraySizeException extends Exception {

    public MyArraySizeException(){
        super("Ошибка в размерности массива, необходимо 4x4");
    }
}