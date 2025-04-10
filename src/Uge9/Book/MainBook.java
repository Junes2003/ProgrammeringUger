package Uge9.Book;

public class MainBook {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Harry Potter");
        book.setAuthor("Mo Osman");
        book.setPrice(499);

        System.out.println(book.getPrice());
        book.applyDiscount(29);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice());
    }
}
