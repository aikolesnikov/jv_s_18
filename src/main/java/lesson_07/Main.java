package lesson_07;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kaim on 7/4/18.
 */
public class Main {


    public static void main(String[] args) {

        // String regex = "([a-z]*[0-9]*[.][a-z]*)@([a-z]*[.][a-z]{0,3})";
        String regex;
        String s = "mytext123.fgh@mail.com";

        Pattern pattern = Pattern.compile("[\\w]{1,10}.[\\w]*@[\\w]*\\.[\\w]{0,3}");
        Matcher matcher = pattern.matcher(s);

        System.out.println(matcher.matches());
    }
}
