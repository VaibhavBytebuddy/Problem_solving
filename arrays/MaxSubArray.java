package problem_solving;

import java.util.ArrayList;
import java.util.ListIterator;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int maxSum=Integer.MIN_VALUE;
        int temp=0;

        for(int i=0;i< arr.length;i++)
        {

            temp+=arr[i];
              if(maxSum<temp)
              {
                  maxSum=temp;
              }
              if(temp<0)
              {
                  temp=0;
              }



        }

        System.out.println("sum "+maxSum);
    }
}
