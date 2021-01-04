package array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,9,6,56};
//        int n= arr.length;
        reverse(arr,0, arr.length-1);
        printArray(arr);
    }
//    static void reverse(int[] arr)
//    {
//        int n=arr.length;
//        for(int i=n-1;i>=0;i--)
//        {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
    static void reverse(int[] arr,int start,int end)
    {
//        int start=0,end=arr.length-1;
        while(start < end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end] =temp;
            start++;//Here we can also do recursive call =>reverse(arr,start++,end--)
            end--;
        }
    }
    static void printArray(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
