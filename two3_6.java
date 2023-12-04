/**
 * Півоваренко, компмех, завдання 3.6, лаба 2
 * @author pivovarenko
 */
import java.util.Random;
public class two3_6 {
    public static void main(String[] args) {
        int simulations = 1000000;
        int aliceTosses = 0;
        int bobTosses = 0;
        for (int i = 0; i < simulations; i++) {
            int aliceCount = simulateAliceTosses();
            int bobCount = simulateBobTosses();
            aliceTosses += aliceCount;
            bobTosses += bobCount;
        }
        double aliceProbability = (double) aliceTosses / simulations;
        double bobProbability = (double) bobTosses / simulations;
        System.out.println("Ймовірність того, що Аліса зробить менше кидків, ніж Боб: " + aliceProbability);
        System.out.println("Очікувана ймовірність (39/121): " + (39.0 / 121));
        System.out.println("Середня кількість кидків Аліси: " + aliceProbability);
        System.out.println("Середня кількість кидків Боба: " + bobProbability);
    }
    private static int simulateAliceTosses() {
        int tosses = 0;
        while (true) {
            tosses += 2;
            if (Math.random() < 0.25) {
                break;
            }
        }
        return tosses;
    }
    private static int simulateBobTosses() {
        int tosses = 0;
        while (true) {
            tosses += 2;
            if (Math.random() < 0.5) {
                break;
            }
        }
        return tosses;
    }
}
