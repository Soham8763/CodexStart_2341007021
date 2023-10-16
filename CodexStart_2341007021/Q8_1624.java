//Name: Soham Ghosh
// Reg No: 2341007021
// pS Link: https://cses.fi/problemset/task/1624

import java.util.Scanner;

public class Q8_1624 {

    private static final int N = 8;
    private static char[][] board;
    private static int waysCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input chessboard
        board = new char[N][N];
        for (int i = 0; i < N; i++) {
            String row = scanner.next();
            for (int j = 0; j < N; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        // Start the recursive backtracking to place queens
        backtrack(0);

        // Print the number of ways to place the queens
        System.out.println(waysCount);
        scanner.close();
    }

    private static boolean isSafe(int row, int col) {
        // Check if the position is valid and not reserved
        return row >= 0 && row < N && col >= 0 && col < N && board[row][col] != '*' && !isAttacked(row, col);
    }

    private static boolean isAttacked(int row, int col) {
        // Check if any previously placed queen attacks this position
        for (int i = 0; i < N; i++) {
            if (board[i][col] == 'Q' || board[row][i] == 'Q') {
                return true;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return true;
            }
        }

        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return true;
            }
        }

        return false;
    }

    private static void backtrack(int col) {
        if (col == N) {
            // All queens are placed successfully
            waysCount++;
            return;
        }

        for (int i = 0; i < N; i++) {
            if (isSafe(i, col)) {
                board[i][col] = 'Q';  // Place the queen
                backtrack(col + 1);   // Recur for the next column
                board[i][col] = '.';  // Backtrack and remove the queen
            }
        }
    }
}
