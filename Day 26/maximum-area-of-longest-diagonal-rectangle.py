class Solution(object):
    def areaOfMaxDiagonal(self, dimensions):
        dl=0
        da=0
        for i in dimensions:
            if math.sqrt(i[0]*i[0]+i[1]*i[1])>=dl:
                if math.sqrt(i[0]*i[0]+i[1]*i[1])==dl:
                   da=max(da,i[0]*i[1])
                else:
                    dl=math.sqrt(i[0]*i[0]+i[1]*i[1])
                    da=i[0]*i[1]
        return da
