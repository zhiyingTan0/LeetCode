class Solution:
    def longestPalindrome(self, s: str) -> str:
        longest=s[0]
   
        for i in range(len(s)):
            # even length 
            l=i
            r=i+1
            while l>=0 and r<len(s) and s[l]==s[r]:
                l=l-1
                r=r+1
            l=l+1
            if r-l > len(longest):
                longest=s[l:r]
                
            # odd length
            l=i-1
            r=i+1
            while l>=0 and r<len(s) and s[l]==s[r]:
                l=l-1
                r=r+1
            l=l+1
            if r-l>len(longest):
                longest=s[l:r]
                
        return longest
        
          
