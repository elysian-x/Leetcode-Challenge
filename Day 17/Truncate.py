class Solution(object):
    def truncateSentence(self, s, k):
        i=0
        store=""
        wspace=0
        for i in s:
            if i==" ":
                wspace+=1
            if wspace==k:
                break
            store = store + i
        return store
