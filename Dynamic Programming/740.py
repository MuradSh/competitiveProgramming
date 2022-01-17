def deleteAndEarn(nums) -> int:
    memo = {}
    def d(nums,i,memo,sum):
        if(i>=len(nums)): return 0;
        print(memo,nums,sum)   
        if(nums[i]==-1): return d(nums,i+1,memo,sum); 
        if sum in memo: return memo[sum]
        if len(nums)==0 : return 0;
        nums2 = [-1 if v==nums[i]-1 or v==nums[i]+1 else v for v in nums]
        nums3 = [-1 if v==nums[i] else v for v in nums]
        if i<len(nums)-1:
            b = sum+d(nums2,i+1,memo,sum+nums[i])
            a = d(nums3,i+1,memo,sum)
        else:
            b = sum+nums[i]
            a=0
        memo[sum]=max(a,b)
        return memo[sum]
    d(nums,0,memo,0)
    print(memo)
    return memo[max(memo, key=memo.get)]

print(deleteAndEarn([3,4,43,2]))
