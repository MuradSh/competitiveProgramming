package dataStructures.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Collections;

public class containerWithWater {

    public static int maxArea(int[] height) {
        int leftI = 0 ;
        int rightI = height.length-1;
        int sum = 0;
        while(leftI!=rightI){
            System.out.println(leftI+" "+rightI+" "+(rightI-leftI)*Math.min(height[leftI],height[rightI]));
            sum = Math.max(sum,(rightI-leftI)*Math.min(height[leftI],height[rightI]));
            if(height[leftI]>height[rightI]){
                rightI--;
            }else{
                leftI++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {10,9,8,7,6,5,4,3,2,1};
        System.out.println(maxArea(a));
    }
}
