class Solution(object):
    def restoreString(self, s, indices):
       ss=list(s)
       for i in range(len(s)):
        ss[indices[i]]=s[i]
       return ''.join(ss)
        
