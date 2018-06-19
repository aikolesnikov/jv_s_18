package lesson_01;

public class Main {

    private final static int size = 11;


    private static void printRightTopRightBottomByOneCycle() {
        int k;
        for (int i = 0; i < size; i++) {
            k = (i < size / 2) ? i : size - i - 1;
            for (int j = 0; j <= k; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void printLeftTopLeftBottomByOneCycle() {
        int k;
        for (int i = 0; i < size; i++) {
            k = (i < size / 2) ? i : size - i - 1;
            for (int j = 0; j <= k; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }


    private static void printLeftTop() {
        for (int i = size; i > 0; i--) {
            for (int j = 1; j <= size; j++) {
                if (j < i)
                    System.out.print(' ');
                else
                    System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void printLeftBottom() {
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                if (j >= i)
                    System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }

    private static void printRightTop() {
        for (int i = 0; i < size; i++) {

            for (int j = 1; j <= size; j++) {
                if (j > i)
                    System.out.print(' ');
                else
                    System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void printRightBottom() {
        for (int i = 0; i < size; i++) {

            for (int j = size; j >= 0; j--) {
                if (j > i)
                    System.out.print('*');
                else
                    System.out.print(' ');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // ? printLeftTopLeftBottomByOneCycle();

    }
}
