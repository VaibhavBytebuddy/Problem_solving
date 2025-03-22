package problem_solving.arrays;

public class BestTimeToBuySellStock {
    public static void main(String[] args) {

        int[] arr = {7, 1, 5, 3, 6, 4};
       // int[] arr={7,6,4,3,1};

        int profit=0;
        int min=Integer.MAX_VALUE;



        for (int i = 0; i < arr.length ; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];

            }else {
                profit=Math.max(profit,arr[i]-min);
            }
        }
        System.out.println(profit);



    }
}