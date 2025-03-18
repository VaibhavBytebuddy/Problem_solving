package problem_solving;

public class MaxConjecativeNum {

    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1};
        // int[] arr={1,0,1,1,0,1};


        int count =0;
        int temp=1;

        int val=arr[0];
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                temp++;

            }else {
                if(temp>count)
                {
                    val=arr[i-1];
                    count=temp;
                }
                temp=1;
            }

        }
        if (temp > count) {
            count = temp;
            val = arr[arr.length - 1]; // Update the value
        }


        System.out.println("Themp"+temp);
        System.out.println("Value is "+val);
        System.out.println(count);
    }

}