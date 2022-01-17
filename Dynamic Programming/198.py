def rob(nums) -> int:
    if(len(nums)==2): return max(nums)
    def r(nums,i,memo={}):
        if i in memo: return memo[i]
        if i>=len(nums): return 0;
        if i>=len(nums)-2: return nums[i]
        memo[i] = nums[i]+max(r(nums,i+2,memo),r(nums,i+3,memo))
        return memo[i]
    return max(r(nums,0),r(nums,1))

print(rob([5,10,2]))