def search_subset(s):
    length=len(s)
    L=s[0]
    R=s[len(s)-1]
    if length==1:
        return 1
    if length==2 and L==R:
        return 2
    elif L==R:
        return (search_subset(s[1:length-1]))+2
    elif L != R:
        a=search_subset(s[0:length-1])
        b=search_subset(s[1: length])
        return max(a,b)


class Solution:
    def longestPalindromeSubseq(self, s: str) -> int:
        longest=search_subset(s)
        #print(longest)
            
        return longest
