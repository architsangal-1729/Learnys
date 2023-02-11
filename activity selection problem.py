class Solution:
    
    #Function to find the maximum number of activities that can
    #be performed by a single person.
    def activitySelection(self,n,start,end):
        arr=[]
        for i in range(n):
            arr.append([start[i],end[i]])
        arr.sort(key = lambda item : item[1])
        ans,i=1,0
        for j in range (1,n):
            if arr[i][1]<arr[j][0]:
                ans = ans + 1
                i=j
        return ans
