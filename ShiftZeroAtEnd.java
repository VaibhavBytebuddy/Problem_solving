package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShiftZeroAtEnd {
       public void shiftZero(int nums[])
       {
           if(nums.length==0)
           {
               if(nums[0]==0)
               {
                   System.out.println(nums[0]);
               }else
               {
                   System.out.println("Their is no zero exist in array");
               }
           }

           int zeroCount=0;

           List<Integer> li=new ArrayList<>();
           for(int i=0;i< nums.length;i++)
           {
               if(nums[i]!=0)
               {
                   li.add(nums[i]);
               }else {
                   zeroCount++;
               }
           }



           while(zeroCount!=0)
           {
               li.add(0);
               zeroCount--;
           }

           for(int i=0;i< nums.length;i++)
           {
               nums[i]=li.get(i);
           }

           System.out.println(Arrays.toString(nums));
       }


       public void shiftZeroEfficent(int arr[])
       {
           int insertPos=0;

           for(int ele:arr)
           {
               if(ele!=0)
               {
                   arr[insertPos]=ele;
                   insertPos++;
               }
           }

           while(insertPos< arr.length)
           {
               arr[insertPos]=0;
               insertPos++;
           }

           System.out.println(Arrays.toString(arr));
       }



    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        ShiftZeroAtEnd s=new ShiftZeroAtEnd();
        System.out.println("Extra list needed ");
        s.shiftZero(nums);// efficeint  extra list needed
        System.out.println("No need to add extra list ");
        s.shiftZeroEfficent(nums);



    }
}