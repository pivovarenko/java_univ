public class two2_2 {
    public static void main(String[] args) {
        int binaryNumber = 0b11011010;
        System.out.println("Початкове число: " + Integer.toBinaryString(binaryNumber));
        int leftShifted = binaryNumber << 1;
        System.out.println("Зсув вліво: " + Integer.toBinaryString(leftShifted));
        int rightShiftedSigned = binaryNumber >> 1;
        System.out.println("Зсув вправо (знаковий): " + Integer.toBinaryString(rightShiftedSigned));
        int rightShiftedUnsigned = binaryNumber >>> 1;
        System.out.println("Зсув вправо (беззнаковий): " + Integer.toBinaryString(rightShiftedUnsigned));
    }
    
}
