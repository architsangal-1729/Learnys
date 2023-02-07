import heapq
class Solution:
    def minCost(self,arr,n) :
        heapq.heapify(arr)
        ans = 0
        while len(arr)>1:
            first = heapq.heappop(arr)
            second = heapq.heappop(arr)
            ans += first + second
            heapq.heappush(arr,first + second)
        return ans
