import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author authorName;
    private int publishYear;

    public Book(String bookName, Author authorName, int publishYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishYear = publishYear;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName.getName();
    }

    public String getAuthorSurName() {
        return authorName.getSurName();
    }

    public Author getAuthorName1() {
        return authorName;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        int currentYear = LocalDate.now().getYear();
        if (publishYear < 868 || publishYear > currentYear) {
            System.out.println("Неверное значение года публикации - " + publishYear);
            return;
        } // 868 год появилась первая печатная книга =)
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Книга - " + bookName + " год издания - " + publishYear + " автор - " + authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return publishYear == book.publishYear && Objects.equals(bookName, book.bookName) && Objects.equals(authorName, book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, publishYear);
    }
}
