package lesson_01;

public class Main {

    private final static int size = 11;
    private static int k = 0;

    private static void printOne() {
        for (int i = 0; i < size; i++) {
            k = (i < size / 2) ? i : size - i - 1;
            for (int j = 0; j <= k; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        printOne();

    }
}
