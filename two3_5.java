/**
 * Півоваренко, компмех, завдання 3.5, лаба 2
 * @author pivovarenko
 */
import java.util.Arrays;
import java.util.Scanner;

public class two3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Введіть ціле число: ");
            numbers[i] = scanner.nextInt();
        }
        int median = findMedian(numbers);
        System.out.println("Медіана: " + median);
        scanner.close();
    }
    private static int findMedian(int[] numbers) {
       Arrays.sort(numbers);
        return numbers[2];
    }
    
}
