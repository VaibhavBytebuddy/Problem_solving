package problem_solving;

public class MaxScoreFromSubarray {
    public static void main(String[] args) {
        //int[] arr={4,3,1,5,6};
        int[] arr={5,4,3,1,6};

        int temp=0;
        int sum=0;
        for(int i=0;i<arr.length-1;i++)
        {
            temp=arr[i]+arr[i+1];
            if(temp>sum)
            {
                System.out.println(temp);
                sum=temp;
            }

        }

        System.out.println("final sum "+sum);
    }
}
