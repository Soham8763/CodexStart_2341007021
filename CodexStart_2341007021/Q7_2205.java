//Name: Soham Ghosh
// Reg No: 2341007021
// pS Link: https://cses.fi/problemset/task/2205
import java.util.Scanner;

public class Q7_2205 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        generateGrayCode(n);
        scanner.close();
    }

    private static void generateGrayCode(int n) {
        // Edge case: n = 0
        if (n == 0) {
            System.out.println("0");
            return;
        }

        // Calculate the total number of codes (2^n)
        int totalCodes = 1 << n;

        // Generate and print the Gray code
        for (int i = 0; i < totalCodes; i++) {
            int grayCode = i ^ (i >> 1); // Gray code formula
            String binaryString = Integer.toBinaryString(grayCode);

            // Ensure leading zeros if necessary
            while (binaryString.length() < n) {
                binaryString = "0" + binaryString;
            }

            System.out.println(binaryString);
        }
    }
}
