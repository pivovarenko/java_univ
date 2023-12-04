/**
 * Півоваренко, компмех, завдання 1.3, лаба 3
 * @author pivovarenko
 */
import java.util.Scanner;

public class tree1_3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість чисел (p): ");
        int p = scanner.nextInt();
        if (p <= 0) {
            System.out.println("Кількість чисел повинна бути більше 0.");
            scanner.close();
            return;
        }
        double sum = 0;
        System.out.println("Введіть " + p + " дійсних чисел:");
        for (int i = 0; i < p; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            double number = scanner.nextDouble();
            sum += number;
        }
        double mean = sum / p;
        double sumSquaredDiff = 0;
        for (int i = 0; i < p; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            double number = scanner.nextDouble();
            sumSquaredDiff += Math.pow(number - mean, 2);
        }
        double standardDeviation = Math.sqrt(sumSquaredDiff / (p - 1));
        System.out.println("Середнє: " + mean);
        System.out.println("Стандартне відхилення: " + standardDeviation);
        scanner.close();
    }
}
