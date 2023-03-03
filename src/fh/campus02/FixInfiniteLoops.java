package fh.campus02;

public class FixInfiniteLoops {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i == 1);

        // ___________________________________
        int b = 1;

        while (b < 2) {
            System.out.println(1);
            b++;
        }

        while (true) {
            System.out.println(1);
            break;
        }

    }
}
