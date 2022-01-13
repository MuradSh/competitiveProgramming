def rotate(nums, k: int):
    k=k%len(nums);
    ret = nums.copy()
    for i in range(len(nums)-k):
        nums[i+k]=ret[i]

    for i in range(len(nums)-k,len(nums)):
        nums[i+k-len(nums)]=ret[i]
        
    print(nums)
rotate([-1,-100,3,99],2)
rotate([1,2,3,4,5,6,7],3)