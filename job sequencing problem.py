class Solution:
    def JobScheduling(self,jobs,n):
        jobs.sort(key = lambda x:x.profit,reverse = True)
        slot = [False] *n
        count, maxProfit = 0,0
        for i in range(n):
            for j in range(min(n,jobs[i].deadline)-1,-1,-1):
                if slot[j] == False:
                    slot[j] = True
                    count+=1
                    maxProfit += jobs[i].profit
                    break
        return [count,maxProfit]
