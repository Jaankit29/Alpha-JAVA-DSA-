// input: "Hello good morning Welcome you"
//          5      4     7       7     3
// output: string which has max odd vo. of characters => morning --> 7 (max and odd)

import java.util.ArrayList;
import java.util.Scanner;

// public class MaxOdd {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n = scanner.nextInt();
//         ArrayList<String> strs = new ArrayList<>();

//         for (int i = 0; i < n; i++) {
//             strs.add(scanner.next());
//         }
//         System.out.println(func(strs, n));
//         scanner.close();
//     }
    
//     public static String func(ArrayList<String> strs, int n) {
//         int maxi = Integer.MIN_VALUE;
//         String ans = "";
//         for (int i = 0; i < n; i++) {
//             int size_string = strs.get(i).length();
//             if (size_string % 2 != 0) { // odd
//                 if (maxi < size_string) {
//                     maxi = size_string;
//                     ans = strs.get(i);
//                 }
//             }
//         }
//         if (ans.equals("")) {
//             return "Better luck next time";
//         } else {
//             return ans;
//         }
//     }

// }

/////////////////////////////////////////////////////////////////

// import java.util.ArrayList;
// import java.util.Scanner;

// public class MaxOdd {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String input = scanner.nextLine();
//         String[] words = input.split(" ");
//         ArrayList<String> strs = new ArrayList<>();
//         for (String word : words) {
//             strs.add(word);
//         }
//         System.out.println(func(strs, words.length));
//         scanner.close();
//     }


//     public static String func(ArrayList<String> strs, int n) {
//         int maxi = Integer.MIN_VALUE;
//         String ans = "";
//         for (int i = 0; i < n; i++) {
//             int size_string = strs.get(i).length();
//             if (size_string % 2 != 0) { // odd
//                 if (maxi < size_string) {
//                     maxi = size_string;
//                     ans = strs.get(i);
//                 }
//             }
//         }
//         if (ans.equals("")) {
//             return "Better luck next time";
//         } else {
//             return ans;
//         }
//     }

// }


//********************************* */

/**
 * MaxOdd
 */
public class MaxOdd {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       // int n=sc.nextInt();
       String input= sc.nextLine();
       String[] words= input.split(" ");
       System.out.println(func(words));


    }

    public static String func(String[] words) {
                int maxi = Integer.MIN_VALUE;
                String ans = "";
                for (int i = 0; i < words.length; i++) {
                    int size_string = words[i].length();
                    if (size_string % 2 != 0) { // odd
                        if (maxi < size_string) {
                            maxi = size_string;
                            ans = words[i];
                        }
                    }
                }
                if (ans.equals("")) {
                    return "Better luck next time";
                } else {
                    return ans;
                }
            }
}