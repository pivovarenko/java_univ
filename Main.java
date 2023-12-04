/**
 * Півоваренко, компмех, завдання 2.5, лаба 4
 * @author pivovarenko
 */
import java.util.Arrays;

class Book {
    private int id;
    private String title;
    private String[] authors;
    private String publisher;
    private int year;
    private int pageCount;
    private double price;
    private String bindingType;

    // Конструктори
    public Book(int id, String title, String[] authors, String publisher, int year,
                int pageCount, double price, String bindingType) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.publisher = publisher;
        this.year = year;
        this.pageCount = pageCount;
        this.price = price;
        this.bindingType = bindingType;
    }

    // Методи для роботи з типом
    public void setType(String type) {
        // Можна додати перевірку на валідність типу, якщо необхідно
    }

    public String getType() {
        return "Book";
    }

    // Інші методи за необхідності
    // ...

    // Метод для представлення об'єкта у вигляді рядка
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pageCount=" + pageCount +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }

    // Геттери для доступу до даних
    public String[] getAuthors() {
        return authors;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }
}

public class Main {
    public static void main(String[] args) {
        // Створюємо масив об'єктів книг
        Book[] books = {
                new Book(1, "Book1", new String[]{"Author1"}, "Publisher1", 2000, 300, 20.0, "Hardcover"),
                new Book(2, "Book2", new String[]{"Author2"}, "Publisher2", 2010, 250, 15.0, "Paperback"),
                // Додаткові книги...
        };

        // Виводимо всі книги
        System.out.println("All books:");
        for (Book book : books) {
            System.out.println(book);
        }

        // Задаємо критерії вибору даних
        String selectedAuthor = "Author1";
        String selectedPublisher = "Publisher1";
        int selectedYear = 2005;

        // a) Список книг заданого автора
        System.out.println("\nBooks by author " + selectedAuthor + ":");
        for (Book book : books) {
            if (Arrays.asList(book.getAuthors()).contains(selectedAuthor)) {
                System.out.println(book);
            }
        }

        // b) Список книг заданого видавництва
        System.out.println("\nBooks from publisher " + selectedPublisher + ":");
        for (Book book : books) {
            if (book.getPublisher().equals(selectedPublisher)) {
                System.out.println(book);
            }
        }

        // с) Список книг, надрукованих після заданого року
        System.out.println("\nBooks published after " + selectedYear + ":");
        for (Book book : books) {
            if (book.getYear() > selectedYear) {
                System.out.println(book);
            }
        }
    }
}