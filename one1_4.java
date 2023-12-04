/**
 * Півоваренко, компмех, завдання 1.4, лаба 1
 * @author pivovarenko
 */
import java.util.Scanner;

public class one1_4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ваше ім'я: ");
        String name = scanner.nextLine();
        System.out.print("Введіть ваш номер телефону: ");
        long phoneNumber = scanner.nextLong();
        System.out.println("Привіт, " + name + "! Ваш номер телефону: " + phoneNumber);
        scanner.close();
    }
    
}
