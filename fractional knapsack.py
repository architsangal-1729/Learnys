class Item:
    def __init__(self,val,w):
        self.value = val
        self.weight = w
        
class Solution:
    def fractionalknapsack(self, W,arr,n):
        arr.sort(key = lambda x : x.value/x.weight, reverse = True)
        curr_w = 0
        maxProfit = 0.0
        for i in range (n):
            if curr_w + arr[i].weight <= W:
                maxProfit += arr[i].value
                curr_w += arr[i].weight
            else:
                remain = W - curr_w
                maxProfit += remain/arr[i].weight * arr[i].value
                break
        return maxProfit
