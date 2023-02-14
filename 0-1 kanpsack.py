from functools import lru_cache
class Solution:
    @lru_cache(maxsize=None)
    def knapSackUtil(self,W, wt, val, n):
        if W==0 or n==0:
            return 0
        if wt[n-1]<=W:
            return max((val[n-1]+self.knapSackUtil(W-wt[n-1],wt,val,n-1)),self.knapSackUtil(W,wt,val,n-1))
        else:
            return self.knapSackUtil(W,wt,val,n-1)
                
    def knapSack(self,W, wt, val, n):
        return self.knapSackUtil(W,tuple(wt),tuple(val),n)
