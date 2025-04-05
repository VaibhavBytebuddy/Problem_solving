package problem_solving.string;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {

      String  s = "babad";
        //String s="aaabbaaa";

        StringBuilder sb=new StringBuilder(s);;
        if(s.contentEquals(sb.reverse()))
        {
            System.out.println( s.length());
        }
        int count=0;
        sb.setLength(0);
        for (char ch:s.toCharArray())
        {
            sb.append(ch);
            if(sb.compareTo(sb.reverse()) == 0)
            {
                System.out.println(sb);
               count++;
                System.out.println(count);
            }
        }

        System.out.println("Co"+count);

    }
}
