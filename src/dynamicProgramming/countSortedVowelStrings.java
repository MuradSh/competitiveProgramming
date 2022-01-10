package dynamicProgramming;

public class countSortedVowelStrings {
    public static int countVowelStrings(int n) {
        n-=1;
        int[][] dp = new int[n+1][5];
        dp[0] = new int[]{5,4,3,2,1};

        for(int i=1;i<=n;i++){
            for(int j=0;j<5;j++) {
                int sum=0;
                for(int k=j;k<5;k++){
                    sum+=dp[i-1][k];
                }
                dp[i][j]=sum;
            }
        }
        return dp[n][0];
    }

    public static void main(String[] args) {
        System.out.println(countVowelStrings(1));
        System.out.println(countVowelStrings(3));
        System.out.println(countVowelStrings(30));
    }
}
