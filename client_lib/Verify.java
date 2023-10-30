package client_lib;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Verify {

    public static boolean isValidInt(String input) {
        String intPattern = "\\d+";
        Pattern pattern = Pattern.compile(intPattern);
        return pattern.matcher(input).matches();
    }
}