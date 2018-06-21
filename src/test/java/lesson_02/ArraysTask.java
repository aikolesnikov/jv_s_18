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

    public static void main( String[] args ) {
        System.out.println( Arrays.toString( Task14( new int[]{ 1, 2, 3, 14, 5, 6 } ) ) );

    }

}
