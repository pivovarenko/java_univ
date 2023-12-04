/**
 * Півоваренко, компмех, завдання 1.7, лаба 1
 * @author pivovarenko
 */
import java.util.Scanner;

public class one1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ваше ім'я: ");
        String userName = scanner.nextLine();
        System.out.println("Привіт, " + userName + "!");
        scanner.close();
    }
}
