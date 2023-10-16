//Name: Soham Ghosh
// Reg No: 2341007021
// pS Link: https://cses.fi/problemset/task/1617
import java.util.Scanner;

public class Q2_1617 {

    public static final long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = calculateBitStrings(n);
        System.out.println(result);
        scanner.close();
    }

    public static long calculateBitStrings(int n) {
        // Calculate 2^n modulo MOD
        return power(2, n, MOD);
    }

    public static long power(long base, long exponent, long mod) {
        long result = 1;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % mod;
            }

            base = (base * base) % mod;
            exponent /= 2;
        }

        return result;
    }
}
