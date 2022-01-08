package dataStructures.Arrays;

public class arrays153 {

    public static int findMin(int[] nums) {
        if(nums.length==1) return nums[0];
        int size = nums.length;
        if(nums[size-1]>nums[0]) return nums[0];
        int rot = 1;
        if(nums[size/2]>nums[0]){
            int i=size-2;
            rot = size-1;
            while(nums[size-1]>nums[i]){
                rot--;
                i--;
            }
        }else{
            int i=1;
            while(nums[0]<nums[i]){
                rot++;
                i++;
            }
        }
        return nums[rot];
    }
    // 7,0,1,2,4,5,6
    // 1,2,4,5,6,7,0
    // 2,4,5,6,7,0,1
    public static void main(String[] args) {
        int[] a = {11,13,15,17};
        System.out.println(findMin(a));
    }
}
