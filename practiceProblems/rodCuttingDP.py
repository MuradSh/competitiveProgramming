def rodCut(n,prices):
    dp = [0]*(n)
    for i in range(1,n+1):
        if(i==1): 
            dp[0]=prices[0];
            continue;
        for j in range(1,i):
            dp[i-1] = max(prices[i-1],dp[j-1]+dp[i-j-1],dp[i-1])    
    return dp[n-1]
rodCut(8,[1,5,8,9,10,17,17,20])