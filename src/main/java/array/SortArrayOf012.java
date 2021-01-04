package array;

//import java.util.Arrays;

public class SortArrayOf012 {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,1,2};
        sort012(arr);
    }
    //**************METHOD-1*******************
//    static void sort012(int[] arr)
//    {
//        int n= arr.length;
//        int[] new_arr=new int[n];
//        int k=0;
//        for (int j : arr) {
//            if (j == 0) {
//                new_arr[k++] = j;
//            } }
//        for (int j : arr) {
//            if (j == 1) {
//                new_arr[k++] = j;
//            } }
//        for (int j : arr) {
//            if (j == 2) {
//                new_arr[k++] = j;
//            } }
////        for(int x : new_arr)
////            System.out.println(x+" ");
//        System.out.println(Arrays.toString(new_arr));
//    }
    //**********************METHOD-2*********************
    static void sort012(int[] arr)
    {
        int low=0;
        int mid=0;
        int high= arr.length-1;
        int temp;
        while(mid<=high)
        {
            switch(arr[mid]){
                case 0:
                    temp=arr[mid];
                    arr[mid]=arr[low];
                    arr[low]=temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                break;
                case 2:
                    temp=arr[high];
                    arr[high]=arr[mid];
                    arr[mid]=temp;
                    high--;
                    break;
            }
        }
        for (int i:arr)
            System.out.print(i+" ");
    }
}
