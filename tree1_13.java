/**
 * Півоваренко, компмех, завдання 1.13, лаба 3
 * @author pivovarenko
 */
import java.util.Scanner;

public class tree1_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість кандидатів (N):");
        int N = scanner.nextInt();
        double bestRating = 0.0;
        for (int i = 0; i < N / 2; i++) {
            System.out.println("Введіть рейтинг кандидата " + (i + 1) + ":");
            double candidateRating = scanner.nextDouble();
            bestRating = Math.max(bestRating, candidateRating);
        }
        int switchMoment = (int) (N / Math.E);
        for (int i = N / 2; i < N; i++) {
            System.out.println("Введіть рейтинг кандидата " + (i + 1) + ":");
            double candidateRating = scanner.nextDouble();
            if (i == switchMoment) {
                System.out.println("Вибрано кандидата з вищим рейтингом після перемикача.");
                break;
            } else if (candidateRating > bestRating) {
                System.out.println("Вибрано кандидата " + (i + 1) + " з вищим рейтингом.");
                break;
            }
        }

        scanner.close();
    }
    
}
