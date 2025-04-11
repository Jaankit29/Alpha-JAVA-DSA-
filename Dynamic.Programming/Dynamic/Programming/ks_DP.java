
// Tebulation 
public class ks_DP {
    static int knapSack(int W, int val[], int wt[]) {
        // Number of items
        int n = val.length;

        // Create a DP table
        int[][] dp = new int[n + 1][W + 1];

        // Build table dp[][] in bottom-up manner
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0; // Base case: no items or capacity is 0
                } else if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // Return the maximum value that can be achieved with the given capacity
        return dp[n][W];
    }

    // Driver code for testing
    public static void main(String[] args) {
        int W = 5;
        int[] val = {10, 40, 30, 50};
        int[] wt = {5, 4, 6, 3};

        System.out.println(knapSack(W, val, wt)); // Output: 50
    }
}
