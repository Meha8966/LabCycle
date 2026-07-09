 // 09/7/26CO3  CO3

 // Superclass
class LibraryItem {

    // Public member
    public String title;

    // Protected member
    protected String author;

    // Private member
    private double price;

    // Constructor
    public LibraryItem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter method for price
    public double getPrice() {
        return price;
    }
}

// Subclass
class Book extends LibraryItem {

    private String publisher;
    private int edition;

    // Constructor
    public Book(String title, String author, double price,
                String publisher, int edition) {
        super(title, author, price);
        this.publisher = publisher;
        this.edition = edition;
    }

    // Display complete book details
    public void displayBook() {
        System.out.println("Book Details");
        System.out.println("------------");
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Publisher  : " + publisher);
        System.out.println("Edition    : " + edition);
        System.out.println("Price      : " + getPrice());
    }
}

// Main class
public class Task5 {
    public static void main(String[] args) {

        Book book = new Book(
                "Java Programming",
                "Herbert Schildt",
                650.0,
                "McGraw Hill",
                12
        );

        book.displayBook();
    }
}