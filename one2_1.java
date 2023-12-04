/**
 * Півоваренко, компмех, завдання 2.1, лаба 1
 * @author pivovarenko
 */
import java.util.Scanner;

public class one2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ваше прізвище: ");
        String userName = scanner.nextLine();
        System.out.println("Привіт, " + userName + "!");
        scanner.close();
    }

    
}
