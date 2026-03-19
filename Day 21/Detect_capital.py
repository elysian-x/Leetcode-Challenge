class Solution(object):
    def detectCapitalUse(self, word):
        cap=0
        if word[0].isupper():
            for i in word:
                if i.isupper():
                    cap+=1
            if cap==len(word)or(cap==1):
                return True
        else:
            for i in word:
                if i.isupper():
                    return False
            return True
        return False


        
