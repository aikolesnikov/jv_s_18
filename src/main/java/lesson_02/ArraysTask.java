package lesson_02;

import java.util.Arrays;

public class ArraysTask {


    private static void task_01(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + " ");
        }
        System.out.println();
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.println(ar[i] + " ");
        }


    }

    private static int task_02(int[] ar) {
        int s = 0;

        for (int anAr : ar) {
            s += anAr;
        }

        return s;
    }

    private static int task_03(int[] ar) {
        int max = ar[0];

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }

    private static int task_04(int[] ar) {
        int min = ar[0];

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        return min;
    }

    private static int task_05(int[] ar) {
        int s = 0;

        for (int anAr : ar) {
            if (anAr % 2 == 0) {
                s += anAr;
            }
        }

        return s;
    }

    private static int task_06(int[] ar) {
        int s = 0;

        for (int anAr : ar) {
            if ((anAr % 2 == 0) && (anAr > 19) && (anAr < 31)) {
                s += anAr;
            }
        }

        return s;
    }

    private static void task_07(int[] ar) {
        int maxEven = ar[0];
        int minOdd = ar[0];

        for (int anAr : ar) {
            if ((anAr % 2 == 0) && (anAr > maxEven)) {
                maxEven = anAr;
            }
            if ((Math.abs(anAr % 2) > 0) && (anAr < minOdd)) {
                minOdd = anAr;
            }
        }
        System.out.println("maxEven=" + maxEven + ", minOdd=" + minOdd);

    }

    public static void task_08(int[] ar) {

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < 0) {
                ar[i] = -ar[i];
            }
        }
        System.out.println(Arrays.toString(ar));
    }

    private static void task_09(int[] ar) {

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < 0) {
                ar[i]--;
            }
            if (ar[i] > 0) {
                ar[i]++;
            }
        }
        System.out.println(Arrays.toString(ar));
    }

    private static void task_10(int[] ar) {

        int avg = 0;

        for (int i = 0; i < ar.length; i++) {
            avg += ar[i];
        }
        avg = avg / ar.length;

        int k = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > avg) {
                k++;
            }
        }

        System.out.println(avg + " " + k);
    }

    private static int[] task11(int[] ar1, int[] ar2) {

        int[] ar3 = new int[ar1.length];

        for (int i = 0; i < ar1.length; i++) {
            ar3[i] = ar1[i]+ar2[i];
        }

        return ar3;
    }



    private static int[] task14(int[] ar ) {
        int minPos = 0;
        int maxPos = 0;

        int min = ar[0];
        int max = ar[0];

        for ( int i = 1; i < ar.length; i++ ) {
            if ( ar[i] < min ) {
                min = ar[i];
                minPos = i;
            } else if ( ar[i] > max ) {
                max = ar[i];
                maxPos = i;
            }
        }

        int[] ar2;

        if ( max == min ) {
            ar2 = new int[ar.length - 1];
        } else {
            ar2 = new int[ar.length - 2];
        }

        int j = 0;
        for ( int i = 0; i < ar.length; i++ ) {
            if ( !(( i == minPos ) || ( i == maxPos )) ) {
                ar2[j++] = ar[i];
            }
        }

        return ar2;
    }

    private static void task15(int[] ar) {
        int negCount = 0;
        int posCount = 0;

        for ( int anAr : ar ) {
            if ( ( anAr ) < 0 ) {
                negCount++;
            }
            if ( ( anAr ) > 0 ) {
                posCount++;
            }
        }

        int[] arNeg = new int[negCount];
        int[] arPos = new int[posCount];

        int jNeg = 0, jPos = 0;

        for (int i = 0; i < ar.length; i++) {
            if ((ar[i]) < 0) {
                arNeg[jNeg++] = ar[i];
            }
            if ((ar[i]) > 0) {
                posCount++;
                arPos[jPos++] = ar[i];
            }
        }

        System.out.println(Arrays.toString(arNeg));
        System.out.println(Arrays.toString(arPos));
    }

    private static int[] task16(int[] ar1, int[] ar2) {

        int c = 0;
        for (int i = 0; i < ar1.length; i++) {
            if ((ar2[i] % 2 == 0) && (ar2[i] % 2 == 0)) {
                c++;
            }
        }

        int[] ar3 = new int[c * 2];

        c = 0;
        for (int i = 0; i < ar1.length; i++) {
            if (!((ar2[i] % 2 == 0) && (ar2[i] % 2 == 0))) {
                ar3[c++] = ar1[i];
                ar3[c++] = ar2[i];
            }
        }
        return ar3;
    }

    private static int[] task17(int[] ar) {
        int min = ar[0];
        int max = ar[0];

        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < min) {
                min = ar[i];
            } else if (ar[i] > max) {
                max = ar[i];
            }
        }


        int c = 0;
        int[] tmpAr = new int[ar.length - 1];
        for (int i = 0; i < ar.length; i++) {
            if (!((ar[i] == min) || (ar[i] == max))) {
                tmpAr[c++] = ar[i];
            }
        }

        return Arrays.copyOf(tmpAr, c);
    }

    private static int[] task18(int[] ar1, int[] ar2) {

        int avg1 = 0, avg2 = 0;

        for (int i : ar1) {
            avg1 += i;
        }
        for (int i : ar2) {
            avg2 += i;
        }
        avg1 = avg1/ar1.length;
        avg2 = avg2/ar2.length;


        System.out.println(avg1 + " " + avg2);
        int b1, b2;
        if (avg1<avg2) {
            b1 = avg1;
            b2 = avg2;
        } else {
            b1 = avg2;
            b2 = avg1;
        }


        int c = 0;
        int[] tmpAr = new int[ar1.length+ar2.length];
        for (int i = 0; i < ar1.length; i++) {
            if (((ar1[i] > b1) && (ar1[i] < b2))) {
                tmpAr[c++] = ar1[i];
            }
        }
        for (int i = 0; i < ar2.length; i++) {
            if (((ar2[i] > b1) && (ar2[i] < b2))) {
                tmpAr[c++] = ar2[i];
            }
        }

        return Arrays.copyOf(tmpAr, c);
    }

    public static void main(String[] args) {

        int[] ar = new int[]{1, 3, 5, 7, 8, 10, 22, -24};
        task_01(ar);

        System.out.println(task_02(ar));
        System.out.println();

        System.out.println(task_03(ar));
        System.out.println();

        System.out.println(task_04(ar));
        System.out.println();

        System.out.println(task_05(ar));
        System.out.println();

        System.out.println(task_06(ar));
        System.out.println();

        task_07(ar);
        System.out.println();

        // task_08(ar);
        // SystemUtils.out.println();

        task_09(ar);
        System.out.println();

        task_10(ar);


        // SystemUtils.out.println(Arrays.toString(task14(new int[]{1, 2, 3, 4, 5, 6})));
        // task15(new int[]{1, 2, 3, 4, -5, 6});
        // SystemUtils.out.println(Arrays.toString(task16(new int[]{1, 2, 3, 4, 5, 6}, new int[]{3, 4, 5, 6, 7, 8})));
        // SystemUtils.out.println(Arrays.toString(task17(new int[]{8, 2, 3, 7, 8})));
        System.out.println(Arrays.toString(task18(new int[]{1, 2, 3, 4, 5, 6}, new int[]{3, 4, 5, 6, 7, 8})));

    }

}
