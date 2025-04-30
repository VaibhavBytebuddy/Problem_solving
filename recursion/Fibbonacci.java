package problem_solving.recursion;

import java.util.LinkedList;
import java.util.Queue;

public class Fibbonacci {

    //with dp time complexity is o(n)
    public static int fib(int n,int dp[])
    {
        if(n==0 || n==1)
        {
            return n;
        }
        if (dp[n]!=0)
        {
            return dp[n];
        }

        dp[n]=fib(n-1,dp)+fib(n-2,dp);
        return dp[n];
    }
    //without dp time complexity is more
    public static int fibb(int n)
    {
        if (n==0 || n==1)
        {
            return n;
        }
        return fibb(n-1)+fibb(n-2);
    }
    public static void main(String[] args) {

        int n=6;
        int[] dp=new int[n+1];
        System.out.println(fibb(n));

        System.out.println("fibb with dp  "+fib(n,dp));



    }
}
