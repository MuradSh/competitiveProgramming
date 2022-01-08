package dataStructures.Arrays;

public class arrays33 {
    public static int findMin(int[] nums,int target) {
        if(nums.length==1) return (nums[0]==target) ? 0 : -1;
        int size = nums.length;
        int flag=0;
        int rightP;
        int leftP;
        if(nums[size-1]>nums[0]){
            rightP = size-1;
            leftP = 0;
        }else {
            int rot = 1;
            if (nums[size / 2] > nums[0]) {
                int i = size - 2;
                rot = size - 1;
                while (nums[size - 1] > nums[i]) {
                    if (nums[i] == target) return i;
                    rot--;
                    i--;
                }
            } else {
                int i = 1;
                while (nums[0] < nums[i]) {
                    if (nums[i] == target) return i;
                    rot++;
                    i++;
                }
            }
            rightP = rot - 1;
            leftP = rot;
        }

        while(true){
            flag=0;
            if(nums[leftP]==target) return leftP;
            if(nums[rightP]==target) return rightP;
            if(leftP!=size-1) leftP++;
            else flag++;
            if(rightP>0) rightP--;
            else flag++;
            if(flag==2) break;
        }
        return -1;
    }
    // 7,0,1,2,4,5,6
    // 0,1,2,4,5,6,7
    // 1,2,4,5,6,7,0
    // 2,4,5,6,7,0,1
    public static void main(String[] args) {
        int[] a = {1,2,4,5,6,7,0};
        System.out.println(findMin(a,0));
        System.out.println(findMin(a,3));
        System.out.println(findMin(a,6));
    }

}
