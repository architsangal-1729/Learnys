class Solution
{
    int[] JobScheduling(Job arr[], int n)
    {
         Arrays.sort(arr, new Comparator<Job>() {
            public int compare(Job j1, Job j2) {
                return j2.profit - j1.profit;
            }
        });
        
        boolean [] slots = new boolean[n];
        Arrays.fill(slots,false);
        
        int count=0,maxProfit=0;
        for(int i=0;i<n;i++){
            for(int j=Math.min(arr[i].deadline,n)-1;j>=0;j--){
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
*/
