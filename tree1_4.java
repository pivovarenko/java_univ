/**
 * Півоваренко, компмех, завдання 1.4, лаба 3
 * @author pivovarenko
 */
import java.util.Scanner;

public class tree1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть цілі числа (завершення вводу - натисніть Enter без числа):");
        String input = scanner.nextLine();
        String[] numbersStr = input.split("\\s+");
        int currentCount = 1;
        int maxCount = 1;
        int currentNumber = Integer.parseInt(numbersStr[0]);
        int maxNumber = currentNumber;
        for (int i = 1; i < numbersStr.length; i++) {
            int number = Integer.parseInt(numbersStr[i]);
            if (number == currentNumber) {
                currentCount++;
            } else {
                currentCount = 1;
                currentNumber = number;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxNumber = currentNumber;
            }
        }
        System.out.println("Результат: " + maxCount + " підряд чисел " + maxNumber);
        scanner.close();
    }
    
}
