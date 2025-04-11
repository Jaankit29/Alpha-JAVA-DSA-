import java.util.ArrayList;
import java.util.List;

public class SubSetSum {
    public static void main(String[] args) {
        int[] arr={3, 34, 4, 12, 5, 2, 4, 6, 8, 7, 2, 5};
     
        int t=20;
       
        System.out.println(isSubsetSum(arr, t));

    }

    static Boolean isSubsetSum(int arr[], int t) {
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][t + 1];

        // Initialize the DP table
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true; // Sum of 0 is always possible
        }
        for (int j = 1; j <= t; j++) {
            dp[0][j] = false; // Non-zero sum is not possible with 0 elements
        }

        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= t; j++) {
                if (arr[i - 1] <= j) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // If no subset exists, return false
        if (!dp[n][t]) {
            System.out.println("No subset found");
            return false;
        }

        // Trace back to find the subset
        List<Integer> subset = new ArrayList<>();
        int i = n, j = t;
        while (i > 0 && j > 0) {
            if (dp[i][j] && !dp[i - 1][j]) {
                subset.add(arr[i - 1]); // Include the element
                j -= arr[i - 1];
            }
            i--;
        }

        // Print the subset
        System.out.println("Subset that forms the sum: " + subset);
        return true;
    }
}
