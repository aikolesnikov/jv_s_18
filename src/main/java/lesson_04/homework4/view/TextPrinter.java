package lesson_04.homework4.view;

import java.text.BreakIterator;

public class TextPrinter {
    public static void printEachForward( BreakIterator boundary, String source) {
        int start = boundary.first();
        for (int end = boundary.next();
             end != BreakIterator.DONE;
             start = end, end = boundary.next()) {
            System.out.println(source.substring(start,end));
        }
    }
}
