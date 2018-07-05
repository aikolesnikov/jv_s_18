package lesson_04.homework4;

import lesson_04.homework4.utils.SystemUtils;

import static lesson_04.homework4.utils.Splitter.*;

/**
 * Created by kaim on 6/25/18.
 */
public class Main {

    public static void main( String[] args ) throws Exception{
        String bookFile = "/home/kaim/prog/text.txt";
        String bookText = SystemUtils.readFile( bookFile );

        // for ( String s : splitTextIntoStringSentences( bookText ) ) System.out.println( s );
        // for ( String s : splitTextIntoStringWords( bookText ) ) System.out.println( s );
    }
}
