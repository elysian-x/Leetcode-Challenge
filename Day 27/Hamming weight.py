class Solution(object):
    def hammingWeight(self, n):
        x=0
        while n>0:
            if n%2==1:
                x+=1
            n=n/2
        return x
