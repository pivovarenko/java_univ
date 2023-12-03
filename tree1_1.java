/**
 * Півоваренко, компмех, завдання 1.1, лаба 3
 * @author pivovarenko
 */
public class tree1_1 {
    public static void main(String[] args) {
        String[] stringArray = {"Перший", "Другий", "Третій", "Четвертий", "П'ятий"};
        System.out.print("Масив в один рядок: ");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i]);
            if (i < stringArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); 
        System.out.println("Масив в кожний рядок з вказанням індексу:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Елемент " + i + ": " + stringArray[i]);
        }
    }
    
}
