package problem_solving;

public class CheckArrayIsSorted {
    public boolean isSort(int[] arr)
    {
        int cmp_cnt=0;
        int swap_cnt=0;

        int n=arr.length;
        boolean sorted=false;

        boolean flag=false;
        for(int i=1;i<n;i++)
        {
             flag=false;

            for(int j=0;j<n-i;j++)
            {
                cmp_cnt++;
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[i]=temp;

                    swap_cnt++;
                    flag=true;
                }
            }
            if(flag)
            {
                break;
            }

        }
//        System.out.println(flag);

        System.out.println("No of Comparation "+cmp_cnt);
        System.out.println("No of swap "+swap_cnt);
        if(swap_cnt==0)
        {
            sorted=true;
        }else {
            sorted=false;
        }
      return sorted;

    }

    public static void main(String[] args) {

//        int arr[]={1,2,3,4,5,6};
          int arr[]={2,1,3,4};
        CheckArrayIsSorted a=new CheckArrayIsSorted();

//        System.out.println(a.isSort(arr));
        if(a.isSort(arr))
        {
            System.out.println("Array is already sorted");
        }else {
            System.out.println("Array is not  sorted");
        }


    }

}
