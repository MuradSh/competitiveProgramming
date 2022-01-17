import math
def maxSatisfaction(satisfaction) -> int:
    dp = [0]*len(satisfaction)
    satisfaction.sort()
    print(satisfaction)
    mx = 0
    dp[0] = satisfaction[len(satisfaction)-1]
    j=1
    sms = dp[0]
    for i in range(len(satisfaction)-2,-1,-1):
        dp[j]=dp[j-1]+satisfaction[i]+sms
        sms+=satisfaction[i]
        mx = max(mx,dp[j])
        j+=1;
    print(dp)
    return mx


print(maxSatisfaction([-1,-8,34,0,5,-9]))