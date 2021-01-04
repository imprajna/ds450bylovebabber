package array;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectionOfSortedArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6};
        int[] arr2={5,6,7,8,9};
        int uni=union(arr1,arr2);
        System.out.println(uni);
        int inter=intersection(arr1,arr2);
        System.out.println(inter);
    }
    static int union(int[] arr1,int[] arr2)
    {
      Set<Integer> s1=new HashSet<>();
        for (int k : arr1)
            s1.add(k);
        for (int j : arr2)
            s1.add(j);
      for(int i:s1)
          System.out.print(i+" ");
        System.out.println();
      return s1.size();
    }
    static int intersection(int[] arr1,int[] arr2)
    {
        int n=arr1.length;
        int m= arr2.length;
        int i=0,j=0;
        Set<Integer> s2=new HashSet<>();
        while(i<n && j<m)
        {
            if(arr1[i]<arr2[j])
                i++;
            else if (arr1[i]>arr2[j])
                j++;
            else {
                s2.add(arr1[i]);
                i++;
                j++;
            }
        }
        for (int x:s2)
            System.out.print(x+" ");
        System.out.println();
        return s2.size();
    }
}
