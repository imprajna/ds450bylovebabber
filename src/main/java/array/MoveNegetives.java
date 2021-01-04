package array;

public class MoveNegetives {
    public static void main(String[] args) {
        int[] arr={23,43,-23,-54,-76,-76,2,54,-12};
        rearrange(arr);
    }
//    static void rearrange(int[] arr)
//    {
//        int j=0,temp;
//        for( int i=0;i<arr.length;i++)
//        {
//            if(arr[i]<0) {
//                if (i != j) {
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//                j++;
//            }
//        }
//        for(int i:arr)
//            System.out.print(i +" ");
//    }
    // ****************TWO POINTER METHOD****************
    static void rearrange(int[] arr)
    {
        int left=0;
        int right= arr.length-1;
        while (left <= right)
        {
            if (arr[left] < 0 && arr[right] < 0)
                left++;

             else if (arr[left] > 0 && arr[right] < 0)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            else if (arr[left] > 0 && arr[right] > 0)
                right--;
            else
            {
                left++;
                right--;
            }
        }
        for (int i:arr)
            System.out.print(i+" ");
    }
}
