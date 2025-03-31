package problem_solving.string;

public class RomantoInteger {

    public static int getNumber(char ch)
    {
            switch (ch) {
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;
                case 'L':
                    return 50;
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;
                default:
                    throw new IllegalStateException("Unexpected value: " + ch);
            }
    }

    public static  int  result(String s)
    {
        int res=0;
        int n=s.length();
        for (int i = 0; i < n; i++)
        {
            int curr=getNumber(s.charAt(i));
            int next=(i<n-1) ? getNumber(s.charAt(i+1)):0;

            if (curr < next) {
                res -= curr;
            } else {
                res += curr;
            }


        }
        return res;

    }
    public static void main(String[] args) {

        String s="XXVII";
        System.out.println(result(s));





    }
}
