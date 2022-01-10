package dataStructures.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arrays152 {
    public static int maxProduct(int[] nums) {
        if(nums.length==1) return nums[0];
        int maxSum = 0;
        int sum=1;
        int[] nums2 = nums.clone();
        Arrays.sort(nums2);
        int negatives = 0;
        int lowestNegative = 0;
        for(int i=0 ;i<nums2.length;i++){
            if(nums2[i]<0) negatives++;
            else{
                if(negatives%2==1){
                    lowestNegative=nums2[i-1];
                }
                break;
            }
        }
        if(negatives==0){
            for (int i=0;i<nums.length;i++){
                sum*=nums[i];
                if(nums[i]==0){
                    maxSum=Math.max(maxSum,0);
                    sum=1;
                }
                maxSum = Math.max(sum,maxSum);
            }
        }else if(negatives%2==0){
            for (int i=0;i<nums.length;i++){
                sum*=nums[i];
                if(nums[i]==0){
                    maxSum=Math.max(maxSum,0);
                    if(i!=nums.length-1) {
                        sum = nums[i + 1];
                        maxSum = Math.max(sum,maxSum);
                        i++;
                    }
                }
                maxSum = Math.max(sum,maxSum);
            }
        }else{
            for (int i=0;i<nums.length;i++){
                sum*=nums[i];
                if(nums[i]==0){
                    maxSum=Math.max(maxSum,0);
                    if(i!=nums.length-1) {
                        sum = nums[i + 1];
                        maxSum = Math.max(sum,maxSum);
                        i++;
                    }
                }
                if(negatives==1 && nums[i]<0){
                    maxSum = Math.max(sum,maxSum);
                    if(i!=nums.length-1) {
                        if(nums[i+1]!=0) {
                            sum = nums[i + 1];
                            maxSum = Math.max(sum, maxSum);
                            i++;
                        }else{
                            if(i!=nums.length-2){
                                sum = nums[i + 2];
                                maxSum = Math.max(sum, maxSum);
                                i+=2;
                            }
                        }
                    }
                }
                if(nums[i]==lowestNegative && negatives!=1){
                    maxSum = Math.max(sum/lowestNegative,maxSum);
                    sum = lowestNegative;
                }
                maxSum = Math.max(sum,maxSum);
            }
            if(lowestNegative!=0)
                maxSum=Math.max(maxSum,sum/lowestNegative);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] a = {-2,0};
        System.out.println(maxProduct(a));
    }
}
