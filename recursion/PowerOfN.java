package problem_solving.recursion;

public class PowerOfN {
    public static double myPow(double x, int n) {

        if(n==0)
        {
            return 1;
        }
      //work and inner function
       return x*myPow(x,n-1);

    }
    public static void main(String[] args) {
        System.out.println(myPow(2,10));
    }
}
