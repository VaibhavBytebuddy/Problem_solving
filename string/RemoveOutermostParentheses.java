package problem_solving.string;


import java.nio.charset.CharsetEncoder;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String s="(()())(())";

        int count = 0;
        StringBuilder result = new StringBuilder();

      for(char c:s.toCharArray())
      {
          if(c =='(')
          {
              if(count>0)
              {
                  result.append(c);
              }
              count++;//2
          }else {
              count--;
              if(count>0)
              {
                  result.append(c);
              }
          }
      }

        System.out.println(result);

    }
}
