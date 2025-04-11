


public class Unbounded_KS {

    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) {
        // Write your code here.
        int[][] dp=new int[n+1][w+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=w; j++){
            if(i==0 || j==0){
                dp[i][j]=0;
            }
            else if(weight[i-1]<=j){
                dp[i][j]= Math.max(profit[i-1]+dp[i][j-weight[i-1]], dp[i-1][j]);
            }
            else{
                dp[i][j]=dp[i-1][j];
            }
        }
        }
        return dp[n][w];
    }
    public static void main(String[] args) {
        int n = 3, w = 10;
        int[] profit = {5, 11, 1};
        int[] weight = {2, 4, 6};
        System.out.println(unboundedKnapsack(n, w, profit, weight));
    }
}

