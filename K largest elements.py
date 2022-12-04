import heapq
class Solution:
    #Function to return k largest elements from an array.
    def kLargest(self,li,n,k):
        myList=[]
        heapq.heapify(myList)
        for i in range(n):
            heapq.heappush(myList, li[i]) #O(log n)
            if len(myList) > k:
                heapq.heappop(myList)
        res = []
        while len(myList)>0:
            res.append(heapq.heappop(myList))
        res.reverse()
        return res
