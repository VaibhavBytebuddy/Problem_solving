package problem_solving.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class ReverseStringWord {
    public static void main(String[] args) {
        String s="the sky is blue";
        StringBuilder sb=new StringBuilder();
        LinkedList<String> al=new LinkedList<>();

        int lb=0,ub=0;

        for(int i=0;i<s.length();i++)
        {

            if(s.charAt(i)==' ')
            {
              ub=i;
              al.addFirst(s.substring(lb,ub));
            }
             lb=ub;

            if(i==s.length()-1)
            {
               al.addFirst(s.substring(lb,s.length()));
            }

        }


//        for(Object c:al.toArray())
//        {
//
//            sb.append(c);
//        }
        System.out.println(al.toString());

        for(String word:al)
        {
           sb.append(word).append(" ");
        }
        System.out.println(sb);





    }
}
