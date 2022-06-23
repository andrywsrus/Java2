package lvl2.lesson2;

public class Main {

    public static void main(String[] args) {

        myExeptionArray();
    }

    private static void myExeptionArray() {
        String[][] fourDimArray = {{"5", "0", "8", "1"}, {"8", "5", "0", "9"}, {"1", "7", "9", "3"}, {"3", "2", "3", "1"}};//объявили строковый массив и заполнили его элементами
        System.out.println(); //перенос строки для красоты отображения ;-)
        System.out.println("Размерность массива: " + fourDimArray.length + " x " + fourDimArray.length); // выводим размерность имеющегося массива
        int sumArreyElements = 0;
        int elementArray;
        for (int i = 0; i < fourDimArray.length; i++) {  //идём по строкам
            for (int j = 0; j < fourDimArray.length; j++) {  //идём по столбцам
                System.out.print(" " + fourDimArray[i][j] + " "); // выводим элемеент
                try {
                    sumArreyElements += Integer.parseInt(fourDimArray[i][j]); // парсим String в int и выводим сумму всех элементов
                    elementArray =  Integer.parseInt(fourDimArray[i][j]);
                } catch (NumberFormatException e) {
                    try {
                        throw new MyArrayDataException("Преобразование не удалось, в ячейке с индексом [" + i + "][" + j + "] ошибка. (" + fourDimArray[i][j] + ") - это не цифра, заменили нулём!");
                    } catch (MyArrayDataException ex) {
                        ex.printStackTrace();
                        elementArray = 0; // в случае ошибки в одном из индексов массива, подставляю ноль
                    }
                }
            }
            System.out.println(); //перенос строки ради визуального сохранения табличной формы
        }

        System.out.println("Сумма всех элементов масиива равна: " + sumArreyElements);

        try {
            if (fourDimArray.length != 4) { // проверяем на соответствие условию "исключения"
                throw new MyArraySizeException("не верная размерность массива, должна быть 4 х 4");

            }
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }
}
