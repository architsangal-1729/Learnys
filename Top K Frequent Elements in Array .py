import heapq
class Solution:
	def topK(self, nums, k):
	    myMap = dict()
	    for i in nums:
	        if i in myMap:
    	        myMap[i]+=1
            else:
                myMap[i] = 1
        myList = []
        heapq.heapify(myList)
        for i in myMap:
            heapq.heappush(myList,[myMap[i],i])
            if len(myList)>k:
                heapq.heappop(myList)
        res = []
        while len(myList)>0:
            temp = heapq.heappop(myList)
            res.append(temp[1])
        res.reverse()
        return res
