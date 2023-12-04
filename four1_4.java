/**
 * Півоваренко, компмех, завдання 1.4, лаба 4
 * @author pivovarenko
 */
public class four1_4 {
    protected int protectedData = 42;
    protected int getProtectedData() {
        return protectedData;
    }
    protected void setProtectedData(int value) {
        protectedData = value;
    }
}

class ManipulatingClass {
    public static void main(String[] args) {
        four1_4 myObject = new four1_4();
        int dataValue = myObject.getProtectedData();
        System.out.println("Захищені дані: " + dataValue);
        myObject.setProtectedData(99);
        dataValue = myObject.getProtectedData();
        System.out.println("Нові захищені дані: " + dataValue);
    }
}
