//Name: Soham Ghosh
// Reg No: 2341007021
// pS Link: https://cses.fi/problemset/task/1072/

import java.util.Scanner;

public class Q9_1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Iterate through n and calculate the number of ways for each k
        for (int k = 1; k <= n; k++) {
            // Calculate the number of ways two knights can be placed on a k x k chessboard
            long result = calculateWays(k);
            System.out.println(result);
        }
        scanner.close();
    }

    // Helper method to calculate the number of ways two knights can be placed on a k x k chessboard
    private static long calculateWays(int k) {
        if (k == 1) return 0; // For a 1x1 chessboard, there are no valid placements
        if (k == 2) return 6; // For a 2x2 chessboard, there are 6 valid placements

        // For larger chessboards, we use a formula to calculate the number of valid placements
        return ((long) k * k * (k * k - 1)) / 2 - 4 * (k - 1) * (k - 2);
    }
}