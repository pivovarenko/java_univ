/**
 * Півоваренко, компмех, завдання 1.3, лаба 4
 * @author pivovarenko
 */
public class four1_3 {
    // Загальнодоступне поле
    public int publicField = 10;

    // Приватне поле
    private int privateField = 20;

    // Захищене поле
    protected int protectedField = 30;

    // Поле доступу до пакету
    int packagePrivateField = 40;

    // Загальнодоступний метод
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Приватний метод
    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    // Захищений метод
    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    // Метод доступу до пакету
    void packagePrivateMethod() {
        System.out.println("This is a package-private method.");
    }
    
}
