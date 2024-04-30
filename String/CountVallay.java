import java.util.Scanner;

public class CountVallay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline character
        String s1 = sc.nextLine();
       // sc.close(); // Close scanner to prevent resource leak
        System.out.println(countingValleys(n, s1));
       
    }

    public static int countingValleys(int steps, String path) {
        int seaLevel = 0;
        int valleys = 0;

        for (int i = 0; i < steps; i++) {
            char step = path.charAt(i);
            if (step == 'U') {
                seaLevel++;
                if (seaLevel == 0) {
                    valleys++;
                }
            } else if (step == 'D') {
                seaLevel--;
            }
        }
        return valleys;
    }
}
