public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Paula", "Hawkins");
        Book book1 = new Book("The girl on the train", author1, 2016);
        System.out.println("Первая книга в списке это " + book1.getBookName());
        System.out.println("book1.getYearPublish() = " + book1.getYearPublish());
        System.out.println("author1 = " + author1.getFullName());
        book1.setYearPublish(2017);
        System.out.println(book1.getYearPublish());
        Author author2 = new Author("Karen", "Katchur");
        Book book2 = new Book("Cold woods", author2, 2019);
        System.out.println("book2.getAuthor() = " + book2.getAuthor());
        System.out.println(book2.getBookName());


    }
}