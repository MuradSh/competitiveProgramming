package dynamicProgramming;

public class fibonacci {
    public static int fib(int n) {
        int[] m = new int[n+1];
        return fib(n,m);
    }
    public static int fib(int n, int[] memo){
        if(memo[n]!=0) return memo[n];
        if(n<=1) return 1;
        memo[n] = fib(n-1)+fib(n-2);
        System.out.println(n);
        return memo[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(30));
    }
}
