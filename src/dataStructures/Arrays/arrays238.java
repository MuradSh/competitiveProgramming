package dataStructures.Arrays;

public class arrays238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] count = new int[61];
        for(int i=0;i<=60;i++){
            count[i]=0;
        }
        for(int i: nums){
            count[i+30]++;
        }
        int[] answers=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int sum=1;
            for(int j=0;j<=60;j++){
                if(count[j]==0) continue;
                if(j==30+nums[i]){
                    if(count[j]-1==0) continue;
                    sum*=(Math.pow((j-30),count[j]-1));
                    System.out.println((j-30)+" "+(count[j]-1));
                }else{
                    sum*=(Math.pow((j-30),count[j]));
//                    System.out.println((j-30)+" "+count[j]+" "+Math.pow(-8,(j-30)));
                }
            }
            System.out.println(sum);
            answers[i] = sum;
        }
        return answers;
    }
    public static void main(String[] args) {
        int[] a = {5,9,2,-9,-9,-7,-8,7,-9,10};
        int[] b = productExceptSelf(a);
        for(int i:b){
            System.out.println(i);
        }
//        System.out.println();
    }
}
