class SortArray
{
    private static void sortArray(int nums1[],int nums2[],int m,int n)
    {
        int i=0,j=0,k=0;
        int arr[] = new int[nums1.length+nums2.length];
        while(i<nums1.length && j<nums2.length )
        {
            if(nums1[i]<nums2[j]){
                arr[k] = nums1[i];
                i+=1;
                k+=1;
            }else{
                arr[k] = nums2[j];
                j+=1;
                k+=1;
            }
        }
        while(j<nums2.length){
            arr[k] = nums2[j];
            k+=1;
            j+=1;
        }
        while(i<nums1.length){
            arr[k] = nums1[i];
            k+=1;
            i+=1;
        }
        i=0;
        for(int val:arr)
        {
           nums1[i]=val;
           i+=1;
        }

    }
    public static void main(String[] args) {
        int nums1[]={4,5,6};
        int nums2[]={1,2,3};
        sortArray(nums1,nums2,nums1.length,nums2.length);
    }
}
