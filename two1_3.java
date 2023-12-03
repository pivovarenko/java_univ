public class two1_3 {
    public static void main(String[] args) {
        System.out.print("Це ");
        System.out.print("приклад ");
        System.out.println("використання System.out.print.");
        String name = "Vlad";
        int age = 19;
        double height = 1.92;

        System.out.printf("Ім'я: %s \nВік: %d \nЗріст: %.2f метра%n", name, age, height);
    }
    
}
