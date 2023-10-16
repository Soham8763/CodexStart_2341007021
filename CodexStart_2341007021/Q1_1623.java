//Name: Soham Ghosh
// Reg No: 2341007021
// pS Link: https://cses.fi/problemset/task/1623
import java.util.Scanner;

public class Q1_1623 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // number of apples
        int[] weights = new int[n];  // weights of apples

        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        long minDifference = findMinWeightDifference(weights, 0, 0, 0);
        System.out.println(minDifference);
        scanner.close();
    }

    private static long findMinWeightDifference(int[] weights, int index, long sum1, long sum2) {
        if (index == weights.length) {
            return Math.abs(sum1 - sum2);
        }

        // Try adding the current apple to group 1
        long diff1 = findMinWeightDifference(weights, index + 1, sum1 + weights[index], sum2);

        // Try adding the current apple to group 2
        long diff2 = findMinWeightDifference(weights, index + 1, sum1, sum2 + weights[index]);

        // Choose the minimum weight difference from the two options
        return Math.min(diff1, diff2);
    }
}
