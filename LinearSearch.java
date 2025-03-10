package problem_solving;

public class LinearSearch {

    public boolean linearSearch(int[] arr, int key)
    {
        int lb=0;int ub=arr.length-1;


        while(lb<=ub)
        {
            int mid=(lb+ub)/2;
            if(arr[mid]==key)
            {
                return true;
            }
            if(key>arr[mid])
            {
                lb=mid+1;
            }
            if(key<arr[mid])
            {
                ub=mid-1;
            }

        }
        return false;
    }
    public static void main(String[] args) {

        //int arr[]={1, 2, 3, 4, 6};
        int arr[]={1, 2, 4, 5, 6};
        int key=3;
        LinearSearch l=new LinearSearch();
        if(l.linearSearch(arr,key))
        {
            System.out.println("key found");
        }else {
            System.out.println("key not found");
        }


    }
}
