/**
 * Півоваренко, компмех, завдання 3.1, лаба 4
 * @author pivovarenko
 */
public class four3_1 {
    public class RationalFraction {

        private int numerator;
        private int denominator;
    
        public RationalFraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    
        public RationalFraction add(RationalFraction other) {
            int newNumerator = numerator * other.denominator + other.numerator * denominator;
            int newDenominator = denominator * other.denominator;
            return new RationalFraction(newNumerator, newDenominator);
        }
    
        public RationalFraction subtract(RationalFraction other) {
            int newNumerator = numerator * other.denominator - other.numerator * denominator;
            int newDenominator = denominator * other.denominator;
            return new RationalFraction(newNumerator, newDenominator);
        }
    
        public RationalFraction multiply(RationalFraction other) {
            int newNumerator = numerator * other.numerator;
            int newDenominator = denominator * other.denominator;
            return new RationalFraction(newNumerator, newDenominator);
        }
    
        public RationalFraction divide(RationalFraction other) {
            int newNumerator = numerator * other.denominator;
            int newDenominator = denominator * other.numerator;
            return new RationalFraction(newNumerator, newDenominator);
        }
    
        @Override
        public String toString() {
            return numerator + "/" + denominator;
        }
    } 
}
