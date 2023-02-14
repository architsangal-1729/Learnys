class Solution 
{ 
     private Map<String, Integer> memo = new HashMap<>();

    public int knapSackUtil(int W, int[] wt, int[] val, int n, int[][] memo) {
        if(W==0 || n==0) 
            return 0;
            
        if(memo[n][W]!=-1) 
            return memo[n][W];
        
        if(wt[n-1]<=W) 
            memo[n][W] = Math.max(val[n-1]+knapSackUtil(W-wt[n-1],wt,val,n-1,memo),knapSackUtil(W,wt,val,n-1,memo));
        
        else 
            memo[n][W] = knapSackUtil(W,wt,val,n-1,memo);
        
        return memo[n][W];
    }

    public int knapSack(int W, int[] wt, int[] val, int n) {
        int memo[][] = new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                memo[i][j]=-1;
            }
        }
        return knapSackUtil(W, wt, val, n,memo);
    } 
}
