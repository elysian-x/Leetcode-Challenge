class Solution(object):
    def findFinalValue(self, nums, original):
        def repeat(o):
            if o in nums:
                o=o*2
                return repeat(o)
            else:
                return o
        return repeat(original)
