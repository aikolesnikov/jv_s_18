package lesson_04.homework4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kaim on 6/25/18.
 */
public class Main {

    private static String rawText;
    private static String linkToBook = "/home/kaim/prog/text.txt";

    private void setBookText() {
        try {
            rawText = readFile(linkToBook);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String readFile(String fileName) throws IOException {

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

    public static void main(String[] args) {
        Main program = new Main();
        program.setBookText();

        System.out.println("-- raw -----------------------------");
        System.out.println(rawText);

        System.out.println("-- scanner -----------------------------");
        Scanner sc = new Scanner( rawText );
        sc.useDelimiter( "[!?.]" );
        while (sc.hasNext()){
            System.out.println(sc.next().trim());
        }
        sc.close();

        System.out.println("-- split -----------------------------");
        for ( String s : rawText.split( "[!?.]" )) {
            System.out.println(s.trim());
        }

    }

}
