package lvl2.lesson4;

class OurThread extends Thread {
    Thread thread;
    float arr[];
    String nameArray;

    OurThread(String name, float[] arr, String nameArray) {
        thread = new Thread(this, name);
        this.arr = arr;
        this.nameArray = nameArray;
        thread.start();
    }

    public void run() {
        if (nameArray == "arr1") {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        } else if (nameArray == "arr2") {
            for (int i = 0, j = arr.length / 2; i < arr.length; i++, j++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
            }
        }

    }
}
