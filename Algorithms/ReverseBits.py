class Solution:
    def reverse(self, x: int) -> int:
        if x > (2**(31)-1) or x<(-2**(31)):
            return 0
        ptr=1
        if x<0:
            x=-x
            ptr=-1
        xReverse=0
        while x>0:
            tmp=x%10
            x=(x-tmp)/10
            xReverse=int(xReverse*10+tmp)
        if ptr==-1:
            if -xReverse <(-2**(31)):
                return 0
            return -xReverse
        if xReverse > (2**(31)-1):
            return 0
        return xReverse
        
