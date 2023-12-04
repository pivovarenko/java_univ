/**
 * Півоваренко, компмех, завдання 3.24, лаба 1
 * @author pivovarenko
 */
import java.util.Scanner;

public class one3_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введіть довжину сторони a: ");
        double sideA = scanner.nextDouble();
        System.out.print("введіть довжину сторони b: ");
        double sideB = scanner.nextDouble();
        System.out.print("введіть довжину сторони c: ");
        double sideC = scanner.nextDouble();
        double angleA = calculateAngle(sideB, sideC, sideA);
        double angleB = calculateAngle(sideA, sideC, sideB);
        double angleC = calculateAngle(sideA, sideB, sideC);
        System.out.println("кути трикутника в радіанах:");
        System.out.println("кут A: " + angleA);
        System.out.println("кут B: " + angleB);
        System.out.println("кут C: " + angleC);
        double degreesAngleA = Math.toDegrees(angleA);
        double degreesAngleB = Math.toDegrees(angleB);
        double degreesAngleC = Math.toDegrees(angleC);
        System.out.println("\nкути трикутника в градусах:");
        System.out.println("кут A: " + degreesAngleA);
        System.out.println("кут B: " + degreesAngleB);
        System.out.println("кут C: " + degreesAngleC);
        scanner.close();
    }

    // теорема косинусів
    private static double calculateAngle(double side1, double side2, double side3) {
        return Math.acos((side1 * side1 + side2 * side2 - side3 * side3) / (2 * side1 * side2));
    }
    
}
