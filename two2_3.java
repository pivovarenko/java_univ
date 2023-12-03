/**
 * Півоваренко, компмех, завдання 2.3, лаба 2
 * @author pivovarenko
 */
public class two2_3 {
    public static void main(String[] args) {
        char char1 = 'A';
        char char2 = '7';
        char char3 = '$';
        System.out.println("char1 в двійковій формі: " + charToBinary(char1));
        System.out.println("char2 в двійковій формі: " + charToBinary(char2));
        System.out.println("char3 в двійковій формі: " + charToBinary(char3));
    }
    private static String charToBinary(char c) {
        return String.format("%16s", Integer.toBinaryString(c)).replace(' ', '0');
    }
    
}
