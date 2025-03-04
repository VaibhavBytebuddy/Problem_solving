package problem_solving;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SecLargeEleOfArray {


    public int getSecondLargest(int[] arr) {
        // Code Here

        SortedSet<Integer> s=new TreeSet<>();



        for(int i=0;i< arr.length;i++)
        {
            s.add(arr[i]);
        }
        Iterator itr=s.iterator();

        int arr2[]=new int[s.size()];
        int i=0;
        while(itr.hasNext())
        {
            arr2[i]=(int)itr.next();
            i++;
        }

        if(arr2.length==1)
        {
            return -1;   //when arr={10,10,10}
        }
        return (arr2[arr2.length-2]);

    }
    public static void main(String[] args) {
        int arr[]={3,10,10};

       SecLargeEleOfArray a=new SecLargeEleOfArray();
       a.getSecondLargest(arr);

    }
}
