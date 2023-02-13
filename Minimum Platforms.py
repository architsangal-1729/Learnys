class Solution:
    def minimumPlatform(self,n,arr,dep):
        arr.sort()
        dep.sort()
        plat_needed, ans, i, j = 1, 1, 1, 0
        while i<n and j<n:
            if dep[j]>=arr[i] :
                plat_needed +=1
                i+=1
            else:
                plat_needed -=1
                j+=1
            ans = max(ans,plat_needed)
        return ans
