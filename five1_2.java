/**
 * Півоваренко, компмех, завдання 1.2, лаба 5
 * @author pivovarenko
 */
import java.util.Scanner;
import java.util.Stack;

public class five1_2 {
     p23ublic static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input: ");
        int number = scanner.nextInt();
        Stack<Integer> digitStack = extractDigits(number);
        int reversedNumber = buildReversedNumber(digitStack);
        System.out.println("reversed: " + reversedNumber);
    }
    private static Stack<Integer> extractDigits(int number) {
        Stack<Integer> digitStack = new Stack<>();
        while (number > 0) {
            int digit = number % 10;
            digitStack.push(digit);
            number /= 10;
        }
        return digitStack;
    }

    private static int buildReversedNumber(Stack<Integer> digitStack) {
        int reversedNumber = 0;
        int multiplier = 1;

        while (!digitStack.isEmpty()) {
            reversedNumber += digitStack.pop() * multiplier;
            multiplier *= 10;
        }

        return reversedNumber;
    }
}
