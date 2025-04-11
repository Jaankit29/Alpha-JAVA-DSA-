import java.util.Scanner;


// recursion + memorization

public class knapsack_01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int W = sc.nextInt();
            int n= sc.nextInt();
            int[] val = new int[n];
            int[] wt = new int[W];
           System.out.println("val array");
            for(int i=0; i<n; i++){
                val[i]= sc.nextInt();
            }
            System.out.println("wt array");
            for(int i=0; i<n; i++){
                wt[i]= sc.nextInt();
            }

           // int n = val.length;

            // Create a memoization table initialized to -1
            int[][] t = new int[n + 1][W + 1];
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= W; j++) {
                    t[i][j] = -1;
                }
            }
            System.out.println("Max profit");
            System.out.println(ks(val, wt, W, n, t));
        }
    }

    static int ks(int val[], int wt[], int W, int n, int[][] t) {
        // Base case: no items left or capacity is 0
        if (n == 0 || W == 0) {
            return 0;
        }

        // If already computed, return the cached value
        if (t[n][W] != -1) {
            return t[n][W];
        }

        // If the current item's weight is less than or equal to remaining capacity
        if (wt[n - 1] <= W) {
            
            // Include the item or exclude the item
            int max = Math.max(val[n - 1] + ks(val, wt, W - wt[n - 1], n - 1, t), ks(val, wt, W, n - 1, t));
            return t[n][W] = max;
        } else {
            // Skip the current item
            return t[n][W] = ks(val, wt, W, n - 1, t);
        }
    }
}
