/**
 * Півоваренко, компмех, завдання 2.3, лаба 1
 * @author pivovarenko
 */
import java.util.Scanner;

public class one2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть два дійсних числа через пробіл: ");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double geometricMean = Math.sqrt(number1 * number2);
        System.out.printf("Середнє геометричне (наукове представлення): %.4e%n", geometricMean);
        System.out.printf("Середнє геометричне (десяткове представлення): %.4f%n", geometricMean);
        scanner.close();
    }
    
}
