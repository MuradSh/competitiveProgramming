package BitManipulation;

public class countingBits {
    public static int[] countBits(int n) {
        int[] bits = new int[n+1];
        for(int i=0;i<=n;i++){
            int j=0;
            int k=i;
            while(k!=0){
                k&=(k-1);
                j++;
            }
            bits[i] = j;
        }
        return bits;
    }
    public static void main(String[] args) {
        int[] bits = countBits(5);
        for(int i=0;i<bits.length;i++){
            System.out.println(bits[i]);
        }
    }
}
