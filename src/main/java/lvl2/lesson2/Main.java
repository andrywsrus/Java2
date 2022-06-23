package lvl2.lesson2;
public class Main {
    private static int sumAllStrings(String[][] myArray) throws MyArraySizeException, MyArrayDataException {

        int sumArray = 0;
        if (myArray.length != 4) throw new MyArraySizeException();

        for (int i = 0; i <= myArray.length - 1; i++) {
            if (myArray[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j <= myArray[i].length - 1; j++) {
                try {
                    sumArray += Integer.parseInt(myArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sumArray;
    }
    public static void main(String[] args) {

        String[][] t1 = {{"5", "0", "8", "1"}, {"8", "5", "0", "9"}, {"1", "7", "9", "3"}, {"3", "2", "3", "1"}};

        int sumArray = 0;
        try{
            try {
                sumArray =  sumAllStrings(t1);
            } catch (MyArraySizeException e){
                System.out.println(e.toString());
            }
        } catch (MyArrayDataException e1){
            System.out.println(e1.toString());
        }
        System.out.println("Сумма всех элементов массива равна: " + sumArray);
    }
}