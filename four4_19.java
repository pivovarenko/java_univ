/**
 * Півоваренко, компмех, завдання 4.19, лаба 4
 * @author pivovarenko
 */
import java.util.Scanner;
public class four4_19 {
    private double a, b, c, d, e, f;
    private double x1, x2;
    public four4_19(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    public void setInterval(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
    public double getRootByBisection() {
        double x = (x1 + x2) / 2;
        while (Math.abs(f(x)) > 0.0001) {
            if (f(x1) * f(x) < 0) {
                x2 = x;
            } else {
                x1 = x;
            }
            x = (x1 + x2) / 2;
        }
        return x;
    }
    private double f(double x) {
        return a * x * x * x * x * x + b * x * x * x + c * x * x + d * x + e * Math.exp(x) + f;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть коефіцієнти рівняння a, b, c, d, e, f: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();
        four4_19 equation = new four4_19(a, b, c, d, e, f);
        System.out.print("Введіть інтервал пошуку кореня: ");
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        equation.setInterval(x1, x2);
        double root = equation.getRootByBisection();
        System.out.println("Корінь рівняння: " + root);
    }
}