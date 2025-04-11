public class Spiral {
    public static void main(String[] args) {
        int n = 3; // Number of rows
        int m = 4; // Number of columns
        int[][] arr = { 
            {1, 2, 3, 4}, 
            {5, 6, 7, 8}, 
            {9, 10, 11, 12} 
        };

        // Define boundaries
        int T = 0, R = m - 1, B = n - 1, L = 0;

        // Traverse the array in a spiral order
        while (T <= B && L <= R) {
            // Traverse from left to right on the top row
            for (int i = L; i <= R; i++) {
                System.out.print(arr[T][i] + " ");
            }
            T++; // Move the top boundary down

            // Traverse from top to bottom on the right column
            for (int i = T; i <= B; i++) {
                System.out.print(arr[i][R] + " ");
            }
            R--; // Move the right boundary left

            // Traverse from right to left on the bottom row (if still within bounds)
            if (T <= B) {
                for (int i = R; i >= L; i--) {
                    System.out.print(arr[B][i] + " ");
                }
                B--; // Move the bottom boundary up
            }

            // Traverse from bottom to top on the left column (if still within bounds)
            if (L <= R) {
                for (int i = B; i >= T; i--) {
                    System.out.print(arr[i][L] + " ");
                }
                L++; // Move the left boundary right
            }
        }
    }
}
