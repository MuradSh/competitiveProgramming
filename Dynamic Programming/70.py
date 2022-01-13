class Solution:
    def climbStairs(self, n: int) -> int:
        return self.c(n);
    
    def c(self, n: int,memo={}) -> int:
        print(memo)
        if(n in memo): return memo[n]
        if(n==0): return 1;
        if(n<0): return None;
        
        r = self.c(n-1,memo); 
        a = self.c(n-2,memo);

        if(r!=None): 
            memo[n]=r;
        if(a!=None): 
            memo[n]+=a;
            
s = Solution()
print(s.climbStairs(40))