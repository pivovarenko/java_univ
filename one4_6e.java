import java.util.Scanner;

public class one4_6e {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введіть значення x: ");
        double x = scn.nextDouble();
        double result = softPlus(x);
        double derivativeRes = softPlus_derivative(x);
        System.out.println("softPlus(" + x + ") = " + result);
        System.out.println("softPlus_derivative(" + x + ") = " + derivativeRes);
        scn.close();
    }
    private static double softPlus(double x) {
        return Math.log(1 + Math.exp(x));
    }
    private static double softPlus_derivative(double x) {
        return Math.exp(x) / (1 + Math.exp(x));
    }
    
}
