package problem_solving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MissingElement {
    public static void main(String[] args) {
//        int nums[]={0,1};
        int nums[]={9,6,4,2,3,5,7,0,1};




        Arrays.sort(nums);
        int i=0;
        for(int ele:nums)
        {
            if(ele==i)
            {
                i++;
            }
        }
        System.out.println(i);
    }
}
