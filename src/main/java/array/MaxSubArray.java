package array;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(findMaxSubArray(arr));
    }
    //This is kadane's Algorithm
    static int findMaxSubArray(int[] arr)
    {
        int sum=0;
        int maxi=arr[0];
        for (int j : arr) {
            sum = sum + j;
            if (sum > maxi)
                maxi = sum;
            if (sum < 0)
                sum = 0;
        }
        return maxi;
    }
//**********1st Brute Force Method*******************
//  //T.C=O(n^3)
//    static int findMaxSubArray(int[] arr) {
//        int max = 0;
//        int n = arr.length;
//        for (int i = 0; i < n; i++)
//        {
//            for (int j = i; j < n; j++) {
//                int sum = 0;
//                for (int k = i; k <= j; k++)
//                    sum += arr[k];
//                if (sum > max)
//                    max = sum;
//            }
//        }
//        return max;
//    }
    //************2nd Brute force method*******
    //T.C=O(n^2)
//    static int findMaxSubArray(int[] arr) {
//        int max = 0;
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            int sum = 0;
//            for (int j = i; j < n; j++) {
//                sum += arr[j];
//                if (sum > max)
//                    max = sum;
//            }
//        }
//        return max;
//    }
}
