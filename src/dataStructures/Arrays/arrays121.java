package dataStructures.Arrays;

public class arrays121 {
    public static int maxProfit(int[] prices){
        int min = prices[0];
        int sum = 0;
        for(int p: prices){
            if(p<min) min=p;
            sum=Math.max(p-min,sum);
//            System.out.println(p+" "+min+" "+sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {7,6,4,3,1,10};
        System.out.println(maxProfit(a));
    }
}
