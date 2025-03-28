package problem_solving.string;

import java.util.Arrays;

public class ValidAnagram {

    public static boolean checkAnagram(String s,String t)
    {
        if(s.length()==t.length() )
        {
            char[] charArray = s.toCharArray();
            char[] charArray1 = t.toCharArray();
            Arrays.sort(charArray);
            System.out.println(charArray);
            Arrays.sort(charArray1);
            System.out.println(charArray1);
            boolean equals = Arrays.equals(charArray, charArray1);
            System.out.println(equals);


        }
        return false;
    }
    public static void main(String[] args) {

        String s="anagram";
        String t = "nagaram";
      //  String s="rat", t = "car";
        checkAnagram(s,t);
    }
}
