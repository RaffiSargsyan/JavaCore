package homework.book.models;

public class Book {

    private String title;

    private Author author;

    private double price;

    private int count;

    public Book() {
    }

    private String gener;

    public Book(String title, Author author, double price, int count, String gener) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.count = count;
        this.gener = gener;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGener() {
        return gener;
    }

    public void setGener(String gener) {
        this.gener = gener;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", gener='" + gener + '\'' +
                '}';
    }
}
