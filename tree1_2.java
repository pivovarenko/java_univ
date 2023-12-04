/**
 * Півоваренко, компмех, завдання 1.2, лаба 3
 * @author pivovarenko
 */
import java.util.Scanner;

public class tree1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Введіть цілі числа (введіть 0 для завершення вводу):");
        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            max = Math.max(max, number);
            min = Math.min(min, number);
        }
        if (max == Integer.MIN_VALUE && min == Integer.MAX_VALUE) {
            System.out.println("Жодного числа не введено.");
        } else {
            System.out.println("Найбільше значення: " + max);
            System.out.println("Найменше значення: " + min);
        }
        scanner.close();
    }
}
