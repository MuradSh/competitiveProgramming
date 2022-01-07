package dataStructures.Arrays;

public class arrays53 {
    public static int maxSubArray(int[] nums) {
        int maxSum = -999999;
        int sum=0;
        for(int i: nums){
                sum=Math.max(sum+i  ,i);
            System.out.println(i+" "+sum);
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] a = {-2,-1};
        System.out.println(maxSubArray(a));
    }
}
