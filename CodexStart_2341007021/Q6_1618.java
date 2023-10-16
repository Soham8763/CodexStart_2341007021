//Name: Soham Ghosh
// Reg No: 2341007021
// pS Link: https://cses.fi/problemset/task/1618
import java.util.Scanner;

public class Q6_1618 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int trailingZeros = 0;

        // Count the number of factors of 5
        while (n > 0) {
            n /= 5;
            trailingZeros += n;
        }

        System.out.println(trailingZeros);
        scanner.close();
    }
}
