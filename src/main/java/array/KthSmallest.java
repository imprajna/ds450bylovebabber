package array;

import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr={2,7,4,98,54,12};
        int ele=findKthSmallest(arr,2);
        System.out.println(ele);
    }
    static int findKthSmallest(int[] arr,int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
         return pq.poll();
    }
}
