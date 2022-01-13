def maxSumAfterPartitioning(arr, k: int):
    dp = [0]*len(arr)
    for i in range(0,len(arr)):
        mx = 0;
        for j in range(0,k):
            f = i-j 
            if(f<0): continue;
            mx = max(mx,arr[f])
            print(i,f,dp,mx)
            if(f>=1): dp[i]=max(dp[i],mx*(j+1)+dp[f-1])
            else: dp[i]=max(dp[i],mx*(j+1)) 
        print(dp)

    return dp[len(arr)-1]

print(maxSumAfterPartitioning([3,7],2))
