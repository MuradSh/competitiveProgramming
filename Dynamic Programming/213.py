def rob(nums) -> int:
    if(len(nums)<=3): return max(nums)
    def r(nums,i,st,memo={}):
        if i in memo: return memo[i]
        if st==0 and i==len(nums)-1: return 0;
        if i>=len(nums): return 0;
        if i>=len(nums)-2: return nums[i]
        memo[i] = nums[i]+max(r(nums,i+2,st,memo),r(nums,i+3,st,memo))
        return memo[i]
    return max(r(nums,0,0),r(nums,1,1,{}),r(nums,2,2,{}))

print(rob([1,2,3,4,5,1,2,3,4,5]))