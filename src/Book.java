import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int yearPublish;


    public Book(String bookName, Author author, int yearPublish) {
        this.bookName = bookName;
        this.author = author;
        this.yearPublish = yearPublish;

    }
    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublish() {

        return this.yearPublish;
    }

    public void setYearPublish(int yearPublish) {
        this.yearPublish = yearPublish;
    }

    @Override
    public String toString() {
        return "Книга: " +
                "Имя " + bookName +
                ", " + author +
                ", год публикации " + yearPublish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublish == book.yearPublish && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, yearPublish);
    }
}
