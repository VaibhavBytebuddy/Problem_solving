package problem_solving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoSumProblem {
    public static void main(String[] args) {
        //2,7,11,15
        int[] arr={2, 7, 11, 15};
        //int[] arr={3,2,3};
        int target=6;
        int[] res={0,0};
        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                int sum=arr[i]+arr[j];
                if(sum==target)
                {
                    res[0]=i;
                    res[1]=j;
                }
            }


        }
        System.out.println("This is my approch which take O(n^2) time complexity");
        System.out.println(Arrays.toString(res));

        System.out.println("This is Better approch because it take O(n) time complexity");
        int[] i1={0,0};
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i< arr.length;i++)
        {
            int com=target-arr[i];
            if(m.containsKey(com))
            {
                 i1 = new int[]{m.get(com),i};
            }
            m.put(arr[i],i);
        }
        System.out.println(Arrays.toString(i1));


    }
}
