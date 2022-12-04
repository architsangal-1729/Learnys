import heapq
class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        myList = []
        heapq.heapify(myList)
        n=len(points)
        for i in range(n):
            dis = points[i][0] ** 2 + points[i][1] ** 2
            heapq.heappush(myList,(dis * -1,points[i]))
            if len(myList) > k:
                heapq.heappop(myList)
        res=[]
        while len(myList)>0:
            temp = heapq.heappop(myList)
            res.append(temp[1])
        return res
