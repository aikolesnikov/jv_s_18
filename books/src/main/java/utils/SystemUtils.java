package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SystemUtils {
    public static String readFile( String fileName ) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        try ( BufferedReader bufferedReader = new BufferedReader( new FileReader( fileName ) ) ) {
            String line;
            while ( ( line = bufferedReader.readLine() ) != null ) {
                stringBuilder.append( line );
                stringBuilder.append( "\n" );
            }
        } catch ( IOException e ) {
            e.printStackTrace();
        }

        return stringBuilder.toString();
    }
}
