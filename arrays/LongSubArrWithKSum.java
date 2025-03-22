package problem_solving;

public class LongSubArrWithKSum {
    public static void main(String[] args) {
       // int[] arr={10,5,2,7,1,-10};
        //int[] arr={-5, 8, -14, 2, 4, 12};
        int[] arr={10, -10, 20, 30};
        int sum=0;
        int k=5;
        int count=0;
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            {
                if(sum==k)
                {
                    temp=i;
                    if(temp>count)
                    {
                        count=temp+1;
                        System.out.println("temp"+temp);
                    }
                }
            }
            temp=0;

        }

        System.out.println("Count"+count);
        System.out.println("sum is "+sum);
    }

}
