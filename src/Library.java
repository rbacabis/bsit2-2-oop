public class Library {
    private Book[] books;
    private int bookCount;

    public Library() {
        books = new Book[10];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
            System.out.println("Book added: " + book.getTitle() + " by " + book.getAuthor());
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void removeBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--bookCount] = null;
                System.out.println("Book with ISBN " + isbn + " removed successfully.");
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    public void borrowBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            book.borrowBook();
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public void returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book with ISBN " + isbn + " not found.");
        }
    }

    public void displayAvailableBooks() {
        System.out.println("\nAvailable books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].displayBookInfo();
            }
        }
    }

    public void displayAllBooks() {
        System.out.println("\nAll books in Library:");
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBookInfo();
        }
    }

    public void getBookCount() {
        System.out.println("Total books in library: " + bookCount);
    }
}