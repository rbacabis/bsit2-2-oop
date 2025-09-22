public class Main {
    public static void main(String[] args) {
        System.out.println("\n=== Library Management System ===");

        Book book1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
        Book book2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
        Book book3 = new Book("Web Development", "Mike Johnson", "5555666677", 2021);

        System.out.println("\nAdding books to library...");
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayAllBooks();

        library.borrowBook("1234567890");
        library.borrowBook("1234567890");

        library.displayAvailableBooks();

        library.returnBook("1234567890");


        System.out.println("\nTesting validation...");
        try {
            Book invalidBook = new Book("Invalid Book", "Test Author", "123", 2030);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            Book invalidBook = new Book("Invalid Book", "Test Author", "1230102101", 2030);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}