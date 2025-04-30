package problem_solving.recursion;

public class SumOfNaturalNum {
    public static int sumNatural(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return n+sumNatural(n-1);
    }
    public static void main(String[] args) {

        System.out.println("Sum of natural number is "+sumNatural(12));
    }
}
