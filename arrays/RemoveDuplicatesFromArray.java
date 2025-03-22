package problem_solving;

import java.util.*;

public class RemoveDuplicatesFromArray {


    //not efficeint becaused this logic should have o(n^2) complexity and a condition may cause for indexOutOfBound
//    public int RemoveElement(int arr[])
//    {
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=0;j<arr.length;j++)
//            {
//                if(arr[j]==arr[j+1])
//                {
//                    return j+1;
//                }
//            }
//        }
//        return 0;
//    }


   // I have this approche also but this is also not a efficent
//
//    ArrayList<Integer> al = new ArrayList<>();
//        for (Integer ele : arr) {
//        al.add(ele);
//    }
//        System.out.println(al);
//
//    ListIterator litr=al.listIterator();
//    int i=0;
//        while(litr.hasNext())
//    { i++;
//        if(litr.next()==litr.previous())
//        {
//            return i;
//        }
//    }

        public int RemoveElement(int arr[])
    {
        //using slow fast pointer
        int j=0;//slow pointer
        for(int i=1;i<arr.length;i++)//fast pointer
        {
            if(arr[i]!=arr[j])
            {
                j++;    //first incerement
                arr[j]=arr[i];//then move unique element forward
            }

        }
        for (int ele:arr)
        {
            System.out.println(ele);
        }

        return j+1;  //return unique element count
    }

    public static void main(String[] args) {
        int[] arr={1,1,2};



        RemoveDuplicatesFromArray a=new RemoveDuplicatesFromArray();
        System.out.println(a.RemoveElement(arr));


    }
}
