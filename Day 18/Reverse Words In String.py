class Solution(object):
    def reverseWords(self, s):
        a = s.split()
        l = len(a) - 1
        k=""
        for i in a:
                k=k+i[::-1]
                if(l!=0):
                    k=k+" "
                    l-=1
        return k
