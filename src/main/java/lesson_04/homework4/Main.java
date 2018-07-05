package lesson_04.homework4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.BreakIterator;
import java.util.*;

/**
 * Created by kaim on 6/25/18.
 */
public class Main {

    private static String bookText;
    private static String bookFile = "/home/kaim/prog/text.txt";


    private static String[] splitTextIntoSentences (String text){

        ArrayList<String> sentences = new ArrayList<>( 10 );

        BreakIterator boundary = BreakIterator.getSentenceInstance();
        boundary.setText( text );

        int start = boundary.first();
        for ( int end = boundary.next();
              end != BreakIterator.DONE;
              start = end, end = boundary.next() ) {
            sentences.add( text.substring( start, end ).trim() );
        }
        sentences.trimToSize();

        return sentences.toArray(new String[sentences.size()]);
    }

    private static String[] splitTextIntoWords (String text){

        ArrayList<String> words = new ArrayList<>( 10 );

        BreakIterator boundary = BreakIterator.getWordInstance();
        boundary.setText( text );

        String s;
        int start = boundary.first();
        for ( int end = boundary.next();
              end != BreakIterator.DONE;
              start = end, end = boundary.next() ) {
            s = text.substring(start, end);
            if ((s.length() >= 1) && (Character.isLetterOrDigit(s.charAt(0)))){
                words.add(s);
            }
        }
        words.trimToSize();

        return words.toArray(new String[words.size()]);
    }

    public static void main( String[] args ) {
        Main program = new Main();
        program.setBookText();

        for ( String s : splitTextIntoSentences(bookText) ) {
            System.out.println( s );
        }

        System.out.println("-----------------------");

        for ( String s : splitTextIntoWords(bookText) ) {
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
