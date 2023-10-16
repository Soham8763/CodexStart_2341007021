//Name: Soham Ghosh
// Reg No: 2341007021
// pS Link: https://cses.fi/problemset/task/1069
import java.util.Scanner;

public class Q3_1069 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.next();
        int longestRepetition = findLongestRepetition(sequence);
        System.out.println(longestRepetition);
        scanner.close();
    }

    public static int findLongestRepetition(String sequence) {
        int longestRepetition = 1;
        int currentRepetition = 1;

        // Handle edge cases
        if (sequence == null || sequence.length() == 0) {
            return 0;
        }

        // Iterate through the string character by character
        for (int i = 1; i < sequence.length(); i++) {
            if (sequence.charAt(i) == sequence.charAt(i - 1)) {
                // If the current character is the same as the previous one, increment the repetition count
                currentRepetition++;
            } else {
                // If it's a different character, update the longest repetition and reset the current repetition count
                longestRepetition = Math.max(longestRepetition, currentRepetition);
                currentRepetition = 1;
            }
        }

        // Update the longest repetition in case the last character(s) form the longest repetition
        longestRepetition = Math.max(longestRepetition, currentRepetition);
        return longestRepetition;
    }
}
