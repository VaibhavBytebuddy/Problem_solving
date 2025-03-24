package problem_solving.string;

import java.util.ArrayList;
import java.util.Arrays;

public class LargestOddNumberInString {

    public String method(String num)
    {


                for (int i = num.length() - 1; i >= 0; i--)
                {
                    if ((num.charAt(i) - '0') % 2 != 0)//-0 used to convert char to int In Java, characters are stored as ASCII values. The character '0' has an ASCII value of 48, '1' is 49, '2' is 50, and so on.
                    {
                        return num.substring(0, i + 1);
                    }


            }



        return "";
    }
    public static void main(String[] args) {
        String num="52";

        LargestOddNumberInString l=new LargestOddNumberInString();
        System.out.println(l.method(num));


    }
}
