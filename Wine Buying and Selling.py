class Solution:	
	def wineSelling(self, arr, N):
	    buy, sell = [], []
	    for i in range(N):
	        if arr[i]>0:
	            buy.append([arr[i],i])
	        else:
	            sell.append([arr[i],i])
	    ans, i, j = 0, 0, 0
        while i<len(buy) and j<len(sell):
            mn = min(buy[i][0],-1*sell[j][0])
    		buy[i][0]-=mn
    		sell[j][0]+=mn
    		dist = abs(buy[i][1]-sell[j][1])
    		ans+=mn*dist
    		if buy[i][0]==0:
    		    i+=1
    		if sell[j][0]==0:
    		    j+=1
    	return ans
