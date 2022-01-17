def findTargetSumWays(nums, target: int):
    return f(nums,0,target,len(nums)-1)

def f(nums,summ,target,n,memo={}):
    key = (n,summ)
    if key in memo: return memo[key]
    if(summ==target and n<0):
        return 1;
    if(n<0): return 0;

    neg = f(nums,summ-nums[n],target,n-1)
    pos = f(nums,summ+nums[n],target,n-1)
    memo[key] = neg+pos;
    return memo[key]

print(findTargetSumWays([44,20,38,6,2,47,18,50,41,38,32,24,38,38,30,5,26,15,37,35],44))
