package utils;

import java.text.BreakIterator;
import java.util.ArrayList;

public class Splitter {

    public static String[] splitTextIntoStringSentences( String text ) {

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

        return sentences.toArray( new String[sentences.size()] );
    }

    public static String[] splitTextIntoStringWords( String text ) {

        ArrayList<String> words = new ArrayList<>( 10 );

        BreakIterator boundary = BreakIterator.getWordInstance();
        boundary.setText( text );

        String s;
        int start = boundary.first();
        for ( int end = boundary.next();
              end != BreakIterator.DONE;
              start = end, end = boundary.next() ) {
            s = text.substring( start, end );
            if ( ( s.length() >= 1 ) && ( Character.isLetterOrDigit( s.charAt( 0 ) ) ) ) {
                words.add( s );
            }
        }
        words.trimToSize();

        return words.toArray( new String[words.size()] );
    }

}
