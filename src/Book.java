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

}
