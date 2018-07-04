package lesson_04.homework4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by kaim on 6/25/18.
 */
public class Main {

    private static String bookText;
    private static String bookFile = "/home/kaim/prog/text.txt";

    public static void main( String[] args ) {
        Main program = new Main();
        program.setBookText();

        ArrayList<String> sentences = new ArrayList<>( 10 );

        Scanner sc = new Scanner( bookText );
        sc.useDelimiter( "[!?.]" );
        String temp_sentence;
        while ( sc.hasNext() ) {
            temp_sentence = sc.next();
            if ( !(temp_sentence.isEmpty()) ) {
                sentences.add( temp_sentence.trim() );
            }
        }
        sc.close();

        sentences.trimToSize();
        System.out.println( sentences.size() );

        for ( String s : sentences ) {
            System.out.println( s );
        }
    }

    private void setBookText() {
        try {
            bookText = readFile( bookFile );
        } catch ( IOException e ) {
            e.printStackTrace();
        }
    }

    private String readFile( String fileName ) throws IOException {

        try ( BufferedReader bufferedReader = new BufferedReader( new FileReader( fileName ) ) ) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;

            while ( ( line = bufferedReader.readLine() ) != null ) {
                stringBuilder.append( line );
                stringBuilder.append( "\n" );
            }

            return stringBuilder.toString();
        }

    }
}
