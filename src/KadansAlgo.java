public class KadansAlgo {
    public static void main(String[] args)
    {
        int arr[] = {-1,-2,-3,-4};
        int i=0;
        int sum_so_far=0,max_sum=Integer.MIN_VALUE;
        while(i<arr.length)
        {
            sum_so_far = sum_so_far + arr[i];
            if(sum_so_far>max_sum)
                max_sum = sum_so_far;
            if(sum_so_far<0)
                sum_so_far=0;
            i+=1;
        }
        System.out.println(max_sum);
    }
}
