package lesson_04.homework4;

import lesson_04.homework4.utils.SystemUtils;

import java.text.BreakIterator;

import static lesson_04.homework4.view.TextPrinter.printEachForward;

public class BreakIterTest {

    public static void main( String[] args ) throws Exception{
        // String stringToExamine = "Uhu. Lalal? Ogo, ogoo!! Yes... No no no.";

        String stringToExamine = SystemUtils.readFile( "/home/kaim/prog/text.txt" );

        System.out.println(stringToExamine);
        System.out.println("-------------------------------");

        BreakIterator boundary = BreakIterator.getLineInstance();
        boundary.setText(stringToExamine);
        printEachForward(boundary, stringToExamine);
    }
}
