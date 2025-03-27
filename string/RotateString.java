package problem_solving.string;

public class RotateString {

    public static void main(String[] args) {
        String s= "abcde", goal = "cdeab";

        if(s.length()!= goal.length())
        {
            System.out.println("false");
        }
        if(s.equals(goal))
        {
            System.out.println("true");
        }
        int k=1;
        int n=s.length();

        while(k<s.length())
        {
            String substring1 = s.substring(n - k, n);
            String substring2 = s.substring(0, n - k);
            String concat = substring1 + substring2;
            System.out.println(substring2);
            System.out.println(substring1);
            System.out.println(concat);
            if(concat.equals(goal))
            {
                System.out.println("true");
            }

            k++;
        }


    }
}
