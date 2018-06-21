package lesson_02;

import java.util.Arrays;

public class ArraysTask {

    private static int[] Task14( int[] ar ) {
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

    private static void Task15(int[] ar) {
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

    private static int[] Task16(int[] ar1, int[] ar2) {

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

    private static int[] Task17(int[] ar) {
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

    public static void main(String[] args) {
        // System.out.println(Arrays.toString(Task14(new int[]{1, 2, 3, 4, 5, 6})));
        // Task15(new int[]{1, 2, 3, 4, -5, 6});
        // System.out.println(Arrays.toString(Task16(new int[]{1, 2, 3, 4, 5, 6}, new int[]{3, 4, 5, 6, 7, 8})));

        System.out.println(Arrays.toString(Task17(new int[]{8, 2, 3, 7, 8})));
    }
}
