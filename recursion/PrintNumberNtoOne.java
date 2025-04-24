package problem_solving.recursion;

public class PrintNumberNtoOne {

    public static void printNum(int n)
    {
        //base case
        if (n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n+"  ");//work
        printNum(n-1);//inner function
    }
    public static void main(String[] args) {
        printNum(6);

    }
}
