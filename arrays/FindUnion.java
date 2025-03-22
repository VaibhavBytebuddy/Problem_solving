package problem_solving;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FindUnion {
    public static void main(String[] args) {

//        int[] a={1, 2, 3, 4, 5};
//        int[] b={1, 2, 3, 6, 7};

       int  a[] = {2, 2, 3, 4, 5};
       int b[] = {1, 1, 2, 3, 4};


        //Approch one but for sort the array list again applay sort algorthm on it so it has a sort problem
//        int a[] = {1, 1, 1, 1, 1};
//        int b[] = {2, 2, 2, 2, 2};
        List<Integer> al=new ArrayList<>();
        for(int ele:a )
        {
            if(!al.contains(ele))
            {
                al.add(ele);
            }

        }

        for(int ele:b)
        {
            if(!al.contains(ele))
            {
                al.add(ele);
            }
        }

        System.out.println(al);


        //Approch two where i use TreeSet where their is not duplicate and it is sorted manner

        TreeSet<Integer> t=new TreeSet<>();
        for(int ele:a)
        {
            t.add(ele);
        }
        for(int ele:b)
        {
            t.add(ele);
        }
        System.out.println(t);
        ArrayList<Integer> d=new ArrayList<>(t);
        System.out.println(d);
    }
}

