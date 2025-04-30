package problem_solving.recursion;


public class Factorial {
    public static void fact(int n,int fact)
    {
        //base case
        if (n==1)
        {
            System.out.println("factorial is "+fact);
            return;
        }
        fact=fact*n;//work


     fact(n-1,fact);//inner function
    }

    public static int fact2(int n)
    {
        if(n==0)
        {
            return 1;
        }
        int fn=n*fact2(n-1);
        return fn;
    }
    public static void main(String[] args) {

        fact(3,1);
        System.out.println("factorial is "+fact2(3));
    }
}
