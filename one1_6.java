/**
 * Півоваренко, компмех, завдання 1.6, лаба 1
 * @author pivovarenko
 */
import java.util.Scanner;

public class one1_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість чисел: ");
        int count = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Введіть число " + (i + 1) + ": ");
            try {
                double number = scanner.nextDouble();
                sum += number;
            } catch (Exception e) {
                System.out.println("Помилка: введено некоректне число.");
                return;
            }
            scanner.close();
        }
        System.out.println("Сума введених чисел: " + sum);
        

    }}

