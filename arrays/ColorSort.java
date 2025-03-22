package problem_solving;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ColorSort {
    public static void main(String[] args) {

       int[] nums={2,0,2,1,1,0};
        int j,i;
        for( i=1;i<nums.length;i++)
        {
            int k=nums[i];
            for( j=i-1;j>=0 && nums[j]>=k; j--)
            {
                nums[j+1]=nums[j];

            }
            nums[j+1]=k;
        }



        System.out.println(Arrays.toString(nums));

    }
}
