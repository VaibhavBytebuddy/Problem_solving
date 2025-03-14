package problem_solving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class FindSingleElement
{
    public static void main(String[] args) {
        //int arr[]={2,1,2};
        //int arr[]={4,1,2,1,2};
        int arr[] = {1, 3, 1, -1, 3};

        //efficeint logic but not mine ,its chatgbt

        Arrays.sort(arr);
        int val = arr[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i += 2) {
            if (i + 1 >= arr.length || arr[i] != arr[i + 1]) {
                val = arr[i];
                break;
            }
        }
        System.out.println(val);






    }

    static{

        //written by me but jot satisfy for this arr
        int arr[] = {1, 3, 1, -1, 3};
        Arrays.sort(arr);
        int val = arr[arr.length-1];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[i] != arr[j]) {
                    val = arr[i];

                }

            }

        }

        System.out.println("Static block output "+val);
        System.out.println("THis execute first ecause static block execute first .Before the main main method");


    }

}
