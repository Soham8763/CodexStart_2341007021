//Name: Soham Ghosh
// Reg No: 2341007021
// pS Link: https://cses.fi/problemset/task/1094
import java.util.Scanner;

public class Q4_1094 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        long totalMoves = calculateTotalMoves(arr);
        System.out.println(totalMoves);
        scanner.close();
    }

    public static long calculateTotalMoves(int[] arr) {
        long totalMoves = 0;
        int prev = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < prev) {
                totalMoves += prev - arr[i];
            } else {
                prev = arr[i];
            }
        }

        return totalMoves;
    }
}
