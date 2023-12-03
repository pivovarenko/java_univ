public class two2_1 {
    public static void main(String[] args) {
        int constant1 = 0xA; 
        int constant2 = 0xB;  
        int bitwiseAnd = constant1 & constant2;
        int bitwiseOr = constant1 | constant2;
        int bitwiseXor = constant1 ^ constant2;
        int bitwiseNotConstant1 = ~constant1;
        int bitwiseNotConstant2 = ~constant2;
        System.out.println("constant1: " + Integer.toHexString(constant1) + " (binary: " + Integer.toBinaryString(constant1) + ")");
        System.out.println("constant2: " + Integer.toHexString(constant2) + " (binary: " + Integer.toBinaryString(constant2) + ")");

        System.out.println("\nBitwise AND: " + Integer.toHexString(bitwiseAnd) + " (binary: " + Integer.toBinaryString(bitwiseAnd) + ")");
        System.out.println("Bitwise OR: " + Integer.toHexString(bitwiseOr) + " (binary: " + Integer.toBinaryString(bitwiseOr) + ")");
        System.out.println("Bitwise XOR: " + Integer.toHexString(bitwiseXor) + " (binary: " + Integer.toBinaryString(bitwiseXor) + ")");
        System.out.println("Bitwise NOT constant1: " + Integer.toHexString(bitwiseNotConstant1) + " (binary: " + Integer.toBinaryString(bitwiseNotConstant1) + ")");
        System.out.println("Bitwise NOT constant2: " + Integer.toHexString(bitwiseNotConstant2) + " (binary: " + Integer.toBinaryString(bitwiseNotConstant2) + ")");
    }
    
}
