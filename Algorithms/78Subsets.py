def getSubsets(nums,list):
    length=len(nums)
    # possible cases=length
    if nums in list:
        return list
    #list.append(nums)
    if length==1:
        list.append(nums)
        return list
    
    for i in range (length):
        
        if i ==(length-1):
            list=getSubsets(nums[0:i],list)
        list=getSubsets(nums[0:i]+nums[(i+1):length],list)
    list.append(nums)
    return list
        
        
    
         
class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        list=[[]]
        return getSubsets(nums,list)
