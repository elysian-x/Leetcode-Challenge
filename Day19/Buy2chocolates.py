class Solution(object):
    def buyChoco(self, prices, money):
        mini1 = min(prices)
        mini_index_1=prices.index(mini1)
        prices.pop(mini_index_1)
        mini2 = min(prices)
        mini_index_2=prices.index(mini2)
        prices.pop(mini_index_2)
        mini=mini1+mini2
        if money-(mini) >= 0:
            return (money-mini)
        else:
            return money

        
