/**
 * Півоваренко, компмех, завдання 1.2, лаба 2
 * @author pivovarenko
 */
import java.util.Scanner;

public class two1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перший рядок: ");
        String str1 = scanner.nextLine();
        System.out.print("Введіть другий рядок: ");
        String str2 = scanner.nextLine();
        if (areStringsEqual(str1, str2)) {
            System.out.println("Рядки рівні.");
        } else {
            System.out.println("Рядки не рівні.");
        }

        scanner.close();
    }
    private static boolean areStringsEqual(String str1, String str2) {
        return str1.equals(str2);
    }
    
}
