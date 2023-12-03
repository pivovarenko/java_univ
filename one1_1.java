/**
 * Півоваренко, компмех, завдання 1.1, лаба 1
 * @author pivovarenko
 */
import java.util.Scanner;

public class one1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число (int): ");
        int intValue = scanner.nextInt();
        System.out.println("Введене ціле число: " + intValue);
        System.out.print("Введіть символ (char): ");
        char charValue = scanner.next().charAt(0);
        System.out.println("Введений символ: " + charValue);
        System.out.print("Введіть рядок (String): ");
        scanner.nextLine(); 
        String stringValue = scanner.nextLine();
        System.out.println("Введений рядок: " + stringValue);
        scanner.close();
    }
}
