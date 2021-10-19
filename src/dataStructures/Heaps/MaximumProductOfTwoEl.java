package dataStructures.Heaps;

import java.util.Arrays;

public class MaximumProductOfTwoEl {
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int sum = (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {3,4,5,2};
        System.out.println(maxProduct(a));
    }
}
