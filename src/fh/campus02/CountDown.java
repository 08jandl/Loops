package fh.campus02;

public class CountDown {
    public static void main(String[] args) {
        int startingNumber = -2;

        countDown(startingNumber);
        //countDown2(startingNumber);
    }

    public static void countDown(int startingNumber) {
        System.out.println(startingNumber);
        while (startingNumber != 0) {
            startingNumber = startingNumber - 1;
            System.out.println(startingNumber);
        }
    }

    public static void countDown2(int startingNumber) {
        while (startingNumber >= 0) {
            System.out.println(startingNumber);
            startingNumber = startingNumber - 1;
        }
    }
}
