/**
 * Півоваренко, компмех, завдання 4.1, лаба 2
 * @author pivovarenko
 */
import java.util.Scanner;

public class two4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть чисельник (p): ");
        int p = scanner.nextInt();
        System.out.print("Введіть знаменник (q): ");
        int q = scanner.nextInt();
        if (q == 0) {
            System.out.println("Ділення на нуль неможливе.");
            return;
        }
        int integerPart = p / q;
        int remainder = p % q;
        System.out.print(integerPart + ".");
        StringBuilder result = new StringBuilder();
        java.util.HashMap<Integer, Integer> remainderMap = new java.util.HashMap<>();
        while (remainder != 0 && !remainderMap.containsKey(remainder)) {
            remainderMap.put(remainder, result.length());
            remainder *= 10;
            result.append(remainder / q);
            remainder %= q;
        }
        if (remainder != 0) {
            int index = remainderMap.get(remainder);
            String nonRepeatingPart = result.substring(0, index);
            String repeatingPart = result.substring(index);
            System.out.println(nonRepeatingPart + "(" + repeatingPart + ")");
        } else {
            System.out.println(result);
        }
        scanner.close();
    }
}
