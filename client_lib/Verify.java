package client_lib;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Verify {

    public static boolean isValidInt(String input) {
        String intPattern = "\\d+";
        Pattern pattern = Pattern.compile(intPattern);
        return pattern.matcher(input).matches();
    }

    public static boolean isValidDouble(String input) {
        String doublePattern = "[0-9]+([.,][0-9]+)?";
        Pattern pattern = Pattern.compile(doublePattern);
        return pattern.matcher(input).matches();
    }

    public static boolean isValidClientName(String input) {
        String namePattern = "^[A-Za-z]*\\s[A-Za-z]*$";
        Pattern pattern = Pattern.compile(namePattern);
        return pattern.matcher(input).matches();
    }

    public static boolean isValidPhoneNumber(String input) {
        String phonePattern = "\\d{1}-\\d{3}-\\d{3}-\\d{2}-\\d{2}";
        Pattern pattern = Pattern.compile(phonePattern);
        return pattern.matcher(input).matches();
    }
}