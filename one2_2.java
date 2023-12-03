import java.util.Scanner;

public class one2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше ціле число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введіть друге ціле число: ");
        int number2 = scanner.nextInt();
        int digits1 = (int) Math.log10(Math.abs(number1)) + 1;
        int digits2 = (int) Math.log10(Math.abs(number2)) + 1;
        System.out.println("Кількість розрядів першого числа: " + digits1);
        System.out.println("Кількість розрядів другого числа: " + digits2);

        double harmonicMean = 2.0 / (1.0 / number1 + 1.0 / number2);
        System.out.printf("Середнє гармонічне: %.2f%n", harmonicMean);
        scanner.close();
    }
    
}
