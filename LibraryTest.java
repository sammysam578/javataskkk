interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

class Book implements LibraryItem {
    private String title, author;
    private int year;
    private boolean available;

    Book(String title, String author, int year, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.available = available;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public boolean isAvailable() { return available; }
}

public class LibraryTest {
    public static void main(String[] args) {
        LibraryItem item = new Book("Twisted Hate", "Ana Huang", 2023, true);
        System.out.println("Title: " + item.getTitle());
        System.out.println("Author: " + item.getAuthor());
        System.out.println("Year: " + item.getYear());
        System.out.println("Available: " + item.isAvailable());
    }
}
