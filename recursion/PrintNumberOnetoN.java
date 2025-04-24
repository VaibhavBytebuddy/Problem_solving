package problem_solving.recursion;

public class PrintNumberOnetoN {
    public static void printInc(int n,int i)
    {
        //base case
        if(i==n)
        {
            System.out.println(n);
            return;
        }
        System.out.println(i+" ");//work
        printInc(n,i+1);//inner function

    }
    public static void main(String[] args) {

        printInc(6,4);
    }
}
