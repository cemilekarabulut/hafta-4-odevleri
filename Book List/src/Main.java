import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class Main {
    public static void main(String... args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("Picture of Dorian Gray", "Oscar Wilde", 230, LocalDate.of(1890, Month.JUNE, 1)));
        books.add(new Book("Hobbit", "J.R.R Tolkien", 426, LocalDate.of(1937, Month.SEPTEMBER, 1)));
        books.add(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 223, LocalDate.of(1997, Month.JULY, 1)));
        books.add(new Book("Aşk-ı Memnu", "Halit Ziya Uşaklıgil", 424, LocalDate.of(1901, Month.JANUARY, 1)));
        books.add(new Book("The Little Prince", "Antoine de Saint-Exupéry", 96, LocalDate.of(1943, Month.APRIL, 1)));

        Map<String, String> bookAndAuthor = books.stream().collect(toMap(Book::getName, Book::getAuthorName));

        System.out.println("------------------- Mapping between books and authors -------------------");
        for (String book : bookAndAuthor.keySet()) {
            System.out.println("Book: " + book + ", Author:" + bookAndAuthor.get(book));
        }

        List<Book> largeBooks = books.stream().filter(book -> book.getPageNumber() > 100).toList();

        System.out.println("------------------- Books with more than 100 pages -------------------");
        largeBooks.forEach(book -> System.out.println(book.toString()));
    }
}
