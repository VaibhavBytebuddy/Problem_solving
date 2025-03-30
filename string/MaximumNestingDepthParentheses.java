package problem_solving.string;

import javax.swing.plaf.IconUIResource;

public class MaximumNestingDepthParentheses {
    public static void main(String[] args) {
        //String s = "()(())((()()))";
        //String s = "(1)+((2))+(((3)))";
        //String s="()()()()";
        String s="()()((())())";


        int max=0;
        int  temp=0;
        for (char ch:s.toCharArray())
        {

            if(ch=='(')
            {
                 temp++;
            }

            if (temp>max)
            {
                max=temp;
            }
            if(ch==')')
            {
                temp--;
            }
            System.out.println("temp  "+temp);

        }
        System.out.println(max);
    }
}
