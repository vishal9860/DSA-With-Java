public class Bubble_Sort
{
    public static void main(String[] args)
    {
     int arr[]={13,9,7,14,5};
        //[9,13,7,14,5} [9,7,13,14,5] [9,7,13,14,5][9,7,13,5,14]
        //[9,7,13,5][7,9,5,13][7,5,9,13]
        //[5,7,9]
     BubbleSort(arr,0, arr.length-1);
     recursiveprint(arr,0);
    }
    public static void recursiveprint(int[] arr,int start)
    {
        if(start==arr.length)
        {
            return;
        }
        System.out.println(arr[start]);
        recursiveprint(arr,start+1);
    }
    public static void BubbleSort(int[] arr,int si,int li)
    {
        if(li==0)
        {
            return;
        }
        if(si==li)
        {
            BubbleSort(arr,0,li-1);
            return;
        }
        if(arr[si]>arr[si+1])
        {
            int temp=arr[si];
            arr[si]=arr[si+1];
            arr[si+1]=temp;
        }
        BubbleSort(arr,si+1,li);
    }
}
