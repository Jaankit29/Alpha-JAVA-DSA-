public class SubsetSumRecursive {

    // Recursive function to check for subset sum
    public static boolean isSubsetSum(int[] set, int n, int sum) {
        // Base cases
        if (sum == 0) {
            return true; // Subset found
        }
        if (n == 0) {
            return false; // No elements left to form the subset

        }

        // If the current element is greater than the sum, exclude it
        if (set[n - 1] > sum) {
            return isSubsetSum(set, n - 1, sum);
        }

        // Check by including or excluding the current element
        return isSubsetSum(set, n - 1, sum - set[n - 1]) || isSubsetSum(set, n - 1, sum);
    }

    public static void main(String[] args) {
        int[] set = {3, 34, 4, 12, 5, 2};
        int sum = 9;
        int n = set.length;

        if (isSubsetSum(set, n, sum)) {
            System.out.println("YES.");
        } else {
            System.out.println("NO");
        }
    }
}
