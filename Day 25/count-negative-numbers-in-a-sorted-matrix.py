class Solution(object):
    def countNegatives(self, grid):
        neg=0
        for i in grid:
            for j in range(len(i)):
                if (i[j]<0):
                    neg+=1
        return neg

        
