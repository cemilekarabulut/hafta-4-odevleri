import java.time.LocalDate;

public class Book {

    private String name;
    private String authorName;
    private int pageNumber;
    private LocalDate publishDate;

    public Book(String name, String authorName, int pageNumber, LocalDate publishDate) {
        this.name = name;
        this.authorName = authorName;
        this.pageNumber = pageNumber;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Name of the book: " + name + ", Name of the author: " + authorName + ", Number of pages: " + pageNumber + ", Publish date: " + publishDate;
    }
}
