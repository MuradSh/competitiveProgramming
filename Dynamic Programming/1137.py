def tribonacci(n):
    return trib(n);

def trib(n,memo={}):
    if(n in memo): return memo[n];
    if(n==0): return 0;
    if(n<=2): return 1;
    memo[n] = trib(n-3,memo)+trib(n-1,memo)+trib(n-2,memo);
    return memo[n];

print(tribonacci(25))