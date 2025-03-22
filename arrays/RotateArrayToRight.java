package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RotateArrayToRight {


    public static void main(String[] args) {

        int[] nums={1,2,3,4,5,6,7};
        List<Integer> al=new ArrayList<>();
        int k=3;
        int start= nums.length-k;


        for(int i=start;i< nums.length;i++)
        {

           al.add(nums[i]);
        }
        for(int i=0;i<start;i++)
        {
            al.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = al.get(i);
        }

        System.out.println(Arrays.toString(nums));







    }
}
