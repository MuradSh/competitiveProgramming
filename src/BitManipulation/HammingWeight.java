package BitManipulation;

public class HammingWeight {
    public static int hammingWeight(int n) {
        int i=0;
        while(n!=0){
            n=n&(n-1);
            i++;
        }
        return i;
    }
    public static void main(String[] args) {
        // left shift is equal to multiplying number by 2^n
        System.out.println(hammingWeight(12));
        System.out.println(hammingWeight(1232));
        System.out.println(hammingWeight(98));
        System.out.println(hammingWeight(78));
    }
}
