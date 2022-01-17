def minCostClimbingStairs(cost) -> int:
        def m(cost,i,memo={}):
            if i in memo: return memo[i]
            if(i>len(cost)-1): return 0;
            if(i==len(cost)-1): return cost[i]
            if(i+2>len(cost)-1):
                memo[i] = min(m(cost,i+1,memo)+cost[i],cost[i])
                # print(i,memo[i])
            else:
                a = m(cost,i+1,memo)
                b = m(cost,i+2,memo)
                memo[i] = min(a,b)+cost[i]
                # print(i,a,b)
            # print(memo)
            return memo[i]
        return min(m(cost,0),m(cost,1,{}))


print(minCostClimbingStairs([1,100,1,1,1,100,1,1,100,1]))
print(minCostClimbingStairs([0,0,20,30]))
