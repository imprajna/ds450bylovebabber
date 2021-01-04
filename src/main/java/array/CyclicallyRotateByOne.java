package array;

public class CyclicallyRotateByOne {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length-1;
        int temp=arr[n];
        int i;
        for (i=n;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[i]=temp;
        for(int x:arr)
            System.out.print(x+" ");
    }
}
