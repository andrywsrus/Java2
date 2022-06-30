package lvl2.lesson4;

public class TestThread {
    static final int size = 10000000;
    static final int h = size / 2;
    float[] arr = new float[size];

    public static void main(String[] args) {
        TestThread OurArray = new TestThread();
        OurArray.method1();
        OurArray.method2();
    }

    public void method1() {

        System.out.println("Считаем первый метод...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long endtime = System.currentTimeMillis();

        long finishtime = endtime - startTime;
        System.out.println("Время затраченное на выполнение первого метода: " + finishtime + " мс.");

    }
    public void method2() {

        float arr[] = new float[size];
        float arr1[] = new float[h];
        float arr2[] = new float[h];
        System.out.println(" ");
        System.out.println("Считаем второй метод...");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long startTime = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        try {
            OurThread threadOneArray = new OurThread("Первый поток", arr1, "arr1");
            OurThread threadTwoArray = new OurThread("Второй поток", arr2, "arr2");
            threadOneArray.thread.join();
            threadTwoArray.thread.join();
        } catch (InterruptedException e) {
            System.out.println("ОЙ! Всё сломалось!");
        }

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);

        long endtime = System.currentTimeMillis();
        long finishtime = endtime - startTime;

        System.out.println("Время затраченное на выполнение второго метода: " + finishtime + " мс.");
    }
}


