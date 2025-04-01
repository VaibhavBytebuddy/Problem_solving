package problem_solving.string;

import java.util.regex.Pattern;

public class StringToInteger {


    public static int myAtoi(String s) {

        s=s.strip();
        int n = s.length();
        String regex = "[-+]?\\d+";
        if (n == 0) {
            return 0;
        }
        StringBuilder substring = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String sub = s.substring(0, i+1);
            boolean matches = Pattern.matches(regex, sub);
            if (matches) {
                substring.setLength(0);
                substring.append(sub);
            } else {
                break;
            }
        }
        if (substring.length() == 0) {
            return 0;
        }


            return Integer.parseInt(substring.toString()); // Convert to integer




    }

    public static void main(String[] args) {
        String s="   -024";//only this kind of case dont pass other cases are passed


        System.out.println( myAtoi("123az"));

    }
}
