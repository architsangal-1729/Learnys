                  // not syntactically correct and not compiled properly check and make corrections before using this code //
class Solution
{
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr,Collections.reverseOrder());
        
        boolean [] slots = new boolean[n];
        for(int i=0;i<n;i++){
            slots[i]=false;
        }
        int count=0,maxProfit=0;
        for(int i=0;i<n;i++){
            for(int j=Math.min(arr[i].deadline,n)-1;j>0;j--){
                if(slots[j]==false) {
                    slots[j]=true;
                    count++;
                    maxProfit += arr[i].profit;
                    break;
                }
            }
        }
        int[] ans = new int[2];
        ans[0]=count;
        ans[1]=maxProfit;
        return ans;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
