import math;
def search(nums , target: int) -> int:
    if(target not in nums): return -1
    h = len(nums);
    l = 0;
    mid=(h+l)//2
    while l<=h:
        if(nums[mid]==target): return mid;
        if(nums[i]<target): 
            low=mid+1;
        else:
            high = mid-1;
    return -1;

print(search([5],5))