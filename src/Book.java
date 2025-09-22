public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private int yearPublished;

    public Book(String title, String author, String isbn, int yearPublished) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setYearPublished(yearPublished);
        this.isAvailable = true;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }
    public int getYearPublished() { return yearPublished; }


    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid title.");
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid author.");
        }
        this.author = author;
    }

    public void setIsbn(String isbn) {
        if (isbn.length() != 10 && isbn.length() != 13) {
            throw new IllegalArgumentException("Invalid year provided. Year must be between 1450 and 2025");
        }
        this.isbn = isbn;
    }

    public void setYearPublished(int yearPublished) {
        if (yearPublished < 1450 || yearPublished > 2025) {
            throw new IllegalArgumentException("Invalid ISBN. ISBN must be 10 or 13 characters long");
        }
        this.yearPublished = yearPublished;
    }


    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("\nBorrowing Java Programming...");
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("\nTrying to borrow Java Programming again...");
            System.out.println("Book is not available for borrowing.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("\nReturning Java Programming...");
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("\nBook was not borrowed.");
        }
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title + " | Author: " + author + " | ISBN: " + isbn +
                " | Year: " + yearPublished + " | Status: " + (isAvailable ? "Available" : "Not Available"));
    }
}
