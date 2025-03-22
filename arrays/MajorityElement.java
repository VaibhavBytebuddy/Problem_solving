package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {

        int[] arr={2,2,1,1,1,2,2};
        //int[] arr={3,2,3};
        int n= arr.length/2;

       int res = 0;

        Hashtable<Integer,Integer> ht=new Hashtable<>();
       for(int ele:arr)
       {
           ht.put(ele,ht.getOrDefault(ele,0)+1);
           if(n<ht.get(ele))
           {
             res=ele;
           }
       }
        System.out.println("Majority element is "+ res);
        System.out.println("hashMap is "+ht);


    }
}
