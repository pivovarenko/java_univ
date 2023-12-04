/**
 * Півоваренко, компмех, завдання 2.1, лаба 4
 * @author pivovarenko
 */
import java.util.Arrays;

class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String birthDate;
    private String address;
    private String phone;
    private String faculty;
    private int course;
    private String group;

    // Конструктори
    public Student(int id, String lastName, String firstName, String patronymic, String birthDate,
                   String address, String phone, String faculty, int course, String group) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    // Методи для роботи з типом
    public void setType(String type) {
        // Можна додати перевірку на валідність типу, якщо необхідно
    }

    public String getType() {
        return "Student";
    }

    // Інші методи за необхідності
    // ...

    // Метод для представлення об'єкта у вигляді рядка
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                '}';
    }
}

public class four2_1 {
    public static void main(String[] args) {
        // Створюємо масив об'єктів студентів
        Student[] students = {
                new Student(1, "Ivanov", "Ivan", "Ivanovich", "01.01.2000",
                        "Address1", "111-111-111", "Faculty1", 1, "Group1"),
                new Student(2, "Petrov", "Petr", "Petrovich", "02.02.1999",
                        "Address2", "222-222-222", "Faculty2", 2, "Group2"),
                // Додаткові студенти...
        };

        // Виводимо всіх студентів
        System.out.println("All students:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Задаємо критерії вибору даних
        String selectedFaculty = "Faculty1";
        int selectedCourse = 1;
        int selectedBirthYear = 2000;
        String selectedGroup = "Group1";

        // a) Список студентів заданого факультету
        System.out.println("\nStudents from faculty " + selectedFaculty + ":");
        for (Student student : students) {
            if (student.getFaculty().equals(selectedFaculty)) {
                System.out.println(student);
            }
        }

        // b) Списки студентів для кожного факультету і курсу
        System.out.println("\nStudents from each faculty and course:");
        for (Student student : students) {
            if (student.getFaculty().equals(selectedFaculty) && student.getCourse() == selectedCourse) {
                System.out.println(student);
            }
        }

        // с) Список студентів, які народилися після заданого року
        System.out.println("\nStudents born after " + selectedBirthYear + ":");
        for (Student student : students) {
            int birthYear = Integer.parseInt(student.getBirthDate().split("\\.")[2]);
            if (birthYear > selectedBirthYear) {
                System.out.println(student);
            }
        }

        // d) Список навчальної групи
        System.out.println("\nStudents from group " + selectedGroup + ":");
        for (Student student : students) {
            if (student.getGroup().equals(selectedGroup)) {
                System.out.println(student);
            }
        }
    }
}
