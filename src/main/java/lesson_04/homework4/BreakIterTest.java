package lesson_04.homework4;

import java.text.BreakIterator;
import java.util.Locale;

public class BreakIterTest {

    private static void printEachForward(BreakIterator boundary, String source) {
        int start = boundary.first();
        for (int end = boundary.next();
             end != BreakIterator.DONE;
             start = end, end = boundary.next()) {
            System.out.println(source.substring(start,end));
        }
    }

    public static void main( String[] args ) {
        String stringToExamine = "Uhu. Lalal? Ogo, ogoo!! Yes... No no no.";

        BreakIterator boundary = BreakIterator.getWordInstance();
        boundary.setText(stringToExamine);
        printEachForward(boundary, stringToExamine);
    }
}
