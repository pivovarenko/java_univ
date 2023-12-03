/**
 * Півоваренко, компмех, завдання 3.2, лаба 2
 * @author pivovarenko
 */
import java.util.Random;

public class two3_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber1 = random.nextInt(100);
        int randomNumber2 = random.nextInt(100);
        System.out.println("Перше випадкове число: " + randomNumber1);
        System.out.println("Друге випадкове число: " + randomNumber2);
        for (int i = 0; i < 25; i++) {
            int currentNumber = random.nextInt(100);
            System.out.println("Випадкове число " + (i + 1) + ": " + currentNumber);
            if (currentNumber > randomNumber2) {
                System.out.println("Більше за друге випадкове число");
            } else if (currentNumber < randomNumber2) {
                System.out.println("Менше за друге випадкове число");
            } else {
                System.out.println("Дорівнює другому випадковому числу");
            }
            System.out.println(); 
        }
    }
}
