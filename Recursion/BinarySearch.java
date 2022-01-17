public class BinarySearch
{
    public static void main(String[] args)
    {
       int arr[]={2,4,6,10,14,16};
       int result=binary_search(arr,0,arr.length-1,2);
       System.out.println(result);
    }

    public static int binary_search(int[] arr,int start, int end,int key)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==key)
            {
                return mid;
            }
            if(key<arr[mid])
            {
                return binary_search(arr,start,mid-1,key);
            }
            else
            {
                return binary_search(arr,mid-1,end,key);
            }
        }
        return -1;
    }
}
