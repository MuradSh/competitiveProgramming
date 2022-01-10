package BitManipulation;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int ret = nums.length;
        for(int i=0;i<nums.length;i++){
            ret = ret^i^nums[i]; // a^b^b=a
        }
        return ret;
    }

    public static void main(String[] args) {

    }
}
