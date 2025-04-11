public class Fibo_DP {

    //This optimized version has O(n) time complexity and O(n) space complexity.
    // public static void fibonacci(int n) {
    //     if (n <= 0) {
    //         System.out.println("Invalid input. Number of terms should be positive.");
    //         return;
    //     }

    //     int a = 0, b = 1; // Initial values for Fibonacci series
    //     System.out.println("Fibonacci Series up to " + n + " terms:");
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(a + " ");
    //         int next = a + b;
    //         a = b;
    //         b = next;
    //     }
    // }


//****************************************************** *//
    // This optimized version has O(n) time complexity and O(1) space complexity.

     // Function to calculate Fibonacci series using DP
     public static void fibonacci(int n) {
        if (n <= 0) {
            System.out.println("Invalid input. Number of terms should be positive.");
            return;
        }

        int[] fib = new int[n]; // Array to store Fibonacci numbers
        fib[0] = 0; // Base case
        if (n > 1) {
            fib[1] = 1; // Base case
        }

        // Fill the array using bottom-up approach
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Print the Fibonacci series
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }


    public static void main(String[] args) {
        int terms = 10; // Number of terms in the Fibonacci series
        fibonacci(terms);
    }
}
