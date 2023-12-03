/**
 * Півоваренко, компмех, завдання 3.4, лаба 2
 * @author pivovarenko
 */
import java.util.Scanner;

public class two3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть ціле число b: ");
        int b = scanner.nextInt();
        System.out.print("Введіть ціле число c: ");
        int c = scanner.nextInt();
        int uniqueValuesCount = countUniqueValues(a, b, c);
        System.out.println("Кількість різних значень серед a, b і c: " + uniqueValuesCount);
        scanner.close();
    }
    private static int countUniqueValues(int a, int b, int c) {
        if (a == b && b == c) {
            return 1; 
        } else if (a != b && b != c && a != c) {
            return 3; 
        } else {
            return 2;
        }
    }
}
