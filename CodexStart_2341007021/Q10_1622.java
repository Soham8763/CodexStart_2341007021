//Name: Soham Ghosh
// Reg No: 2341007021
// pS Link: https://cses.fi/problemset/task/1622
import java.util.*;

public class Q10_1622 {

    private static Set<String> generateStrings(String input) {
        Set<String> resultSet = new HashSet<>();
        generatePermutations("", input, resultSet);
        return new TreeSet<>(resultSet); // TreeSet to automatically sort the strings
    }

    private static void generatePermutations(String prefix, String remaining, Set<String> resultSet) {
        int n = remaining.length();
        if (n == 0) {
            resultSet.add(prefix);
            return;
        }

        for (int i = 0; i < n; i++) {
            generatePermutations(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, n), resultSet);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        scanner.close();

        Set<String> resultStrings = generateStrings(input);

        System.out.println(resultStrings.size());
        for (String s : resultStrings) {
            System.out.println(s);
        }
    }
}
