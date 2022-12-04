import heapq
class Solution:
    
    #Function to return the sorted array.
    def nearlySorted(self,a,n,k):
        myList, res = [], []
        heapq.heapify(myList)
        for i in range(n):
            heapq.heappush(myList, a[i]) #O(log n)
            if len(myList) > k:
                res.append(heapq.heappop(myList))       
        while len(myList)>0:
            res.append(heapq.heappop(myList))
        
        return res
