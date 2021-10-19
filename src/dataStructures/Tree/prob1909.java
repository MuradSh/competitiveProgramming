package dataStructures;

public class prob1909 {
    public static  boolean canBeIncreasing(int[] nums) {
        int flag=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                flag++;
                if(i>=2) {
                    if (nums[i] > nums[i - 2]) {
                        nums[i - 1] = -1;
                    }else{
                        nums[i] = -1;
                    }
                }else {
                    nums[i - 1] = -1;
                }
            }
            if(flag==2){
                return false;
            }
        }
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]== -1) continue;
            if(nums[i]<=prev){
                System.out.println(nums[i]+" "+prev);
                return false;
            }
            prev = nums[i];
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {105,924,32,968};
        System.out.println(canBeIncreasing(a));
    }
}
