package lesson_01;

public class Main {

    private final static int size = 11;

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
        for (int i = 0; i < size; i++) {

            if (i < size / 2) {
                for (int j = size; j >= 0; j--) {
                    if (j > i)
                        System.out.print(' ');
                    else
                        System.out.print('*');
                }
            } else {
                for (int j = 0; j <= size; j++) {
                    if (j > i)
                        System.out.print('*');
                    else
                        System.out.print(' ');
                }
            }


            System.out.println();


        }
    }

    public static void main(String[] args) {

        System.out.println("Task 1.");
        printRightTopRightBottomByOneCycle();
        System.out.println();

        System.out.println("Task 2.");
        printLeftBottom();
        System.out.println();

        System.out.println("Task 3.");
        printLeftTop();
        System.out.println();

        System.out.println("Task 4.");
        printLeftTopLeftBottomByOneCycle();
        System.out.println();

        System.out.println("Task 5.");
        System.out.println();

    }
}
