public class book {
    private String title;
    private String author;
    private int pages;
    private boolean isAvailable;

    public book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isAvailable = true;
        System.out.println("A new book '" + title + "' by " + author + " has been added to the library!");
    }

    public void displayInfo() {
        System.out.println("------ Book Information ------");
        System.out.println("Title       : " + title);
        System.out.println("Author      : " + author);
        System.out.println("Pages       : " + pages);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
        System.out.println("-------------------------------\n");
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed '" + title + "'.");
        } else {
            System.out.println("Sorry, '" + title + "' is currently not available.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned '" + title + "'. Thank you!");
        } else {
            System.out.println("'" + title + "' was not borrowed.");
        }
    }
}