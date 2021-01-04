package array;

//import java.util.Arrays;

public class MaxMinOfArray {
    public static void main(String[] args) {
        int[] arr = {3, 65, 2, 78, 5, 3, 12};
//        Pair minMax=findMinMax(arr);   =>method-2
//        Pair minMax = findMinMax(arr, 0, arr.length - 1);   =>method-3
        Pair minMax=findMinMax(arr);
        System.out.println("Largest=" + minMax.max);
        System.out.println("Smallest=" + minMax.min);
    }

    //****************METHOD-1**********************
//    static void findMinMax(int[] arr)
//    {
//        Arrays.sort(arr);
//        System.out.println("largest ="+arr[arr.length-1]);
//        System.out.println("Smallest ="+arr[0]);
//    }
    //*******************METHOD-2*************************
//    static class Pair  //inner class to return two values from the function
//    {
//        int max;
//        int min;
//    }
//    static Pair findMinMax(int[] arr)  //Here time complexity =O(n)
//    {
//        Pair minMax=new Pair();
//        int n= arr.length;
//        if(n==1)
//        {
//            minMax.max=minMax.min=arr[0];
//            return minMax;
//        }
//        if(arr[0]>arr[1])
//        {
//            minMax.max=arr[0];
//            minMax.min=arr[1];
//        }
//        else
//        {
//            minMax.max=arr[1];
//            minMax.min=arr[0];
//        }
//        for(int i=2;i<n;i++)
//        {
//            if(arr[i]>minMax.max)
//                minMax.max=arr[i];
//            else if (arr[i]<minMax.min)
//                minMax.min=arr[i];
//        }
//        return minMax;
//    }
    //******************METHOD-3(Tournament Method)*******************************
    //Here time complexity can be reduced by reducing the  no of comparisons
//    static class Pair{
//        int min;
//        int max;
//    }
//    static Pair findMinMax(int[] arr,int beg,int end)
//    {
//        Pair minMax=new Pair();
//        Pair m1,m2=new Pair();
//        if(beg==end)
//        {
//            minMax.max=minMax.min=arr[0];
//            return minMax;
//        }
//        if(end==beg+1)
//        {
//            if(arr[beg]>arr[end])
//            {
//                minMax.max=arr[beg];
//                minMax.min=arr[end];
//            }
//            else
//            {
//                minMax.max=arr[end];
//                minMax.min=arr[beg];
//            }
//            return minMax;
//        }
//        int mid=(beg+end)/2;
//        m1=findMinMax(arr,beg,mid);
//        m2=findMinMax(arr,mid+1,end);
////        if(m1.max<m2.max)
////            minMax.max= m2.max;
////        else
////            minMax.max=m1.max;
//        minMax.max=Math.max(m1.max,m2.max);
//        minMax.min=Math.min(m1.min,m2.min);
//        return minMax;
//    }
    //**************************METHOD-4**********************
    //Here we can pick the elements in pair & hence time complexity will be decreased to n/2
    static class Pair {
        int min;
        int max;
    }

    static Pair findMinMax(int[] arr) {
        Pair minMax = new Pair();
        int n = arr.length;
        int i;
        if (n == 1) {
            minMax.max = minMax.min = arr[0];
            return minMax;
        }
        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                minMax.max = arr[0];
                minMax.min = arr[1];
            } else {
                minMax.max = arr[1];
                minMax.min = arr[0];
            }
            i = 2;
        } else {
            minMax.max = arr[0];
            minMax.min = arr[0];
            i = 1;
        }
        while (i < n - 1) {
            if (arr[i] > arr[i + 1]) {
                if (arr[i] > minMax.max)
                    minMax.max = arr[i];
                if (arr[i + 1] < minMax.min)
                    minMax.min = arr[i + 1];
            } else {
                if (arr[i + 1] > minMax.max)
                    minMax.max = arr[i + 1];
                if (arr[i] < minMax.min)
                    minMax.min = arr[i];
            }
            i = i + 2;
        }
        return minMax;
    }
}