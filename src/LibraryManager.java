import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {

    private ArrayList<String> books;
    private Scanner scanner;

    public LibraryManager() {
        books = new ArrayList<>();
        books.add("Java Programming");
        books.add("Web Development");
        books.add("Database Design");
        scanner = new Scanner(System.in);
    }


    public void showBooks() {
        try {
            if (books == null) {
                throw new IllegalStateException("Book list is not initialized.");
            }

            System.out.println("\n--- Current Books ---");
            if (books.isEmpty()) {
                System.out.println("No books available in the library.");
            } else {
                for (int i = 0; i < books.size(); i++) {
                    System.out.println((i + 1) + ". " + books.get(i));
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Display operation completed.");
        }
    }


    public void addBook() {
        try {
            System.out.print("\nEnter book title to add: ");
            String title = scanner.nextLine().trim();

            if (title.isEmpty()) {
                throw new IllegalArgumentException("Book title cannot be empty!");
            }

            if (title.length() < 3) {
                throw new IllegalArgumentException("Book title must be at least 3 characters long!");
            }

            books.add(title);
            System.out.println("Book '" + title + "' added successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Add book operation completed.");
            showBooks();
        }
    }

    public void removeBook() {
        try {
            if (books.isEmpty()) {
                System.out.println("No books available to remove.");
                return;
            }

            System.out.print("\nEnter book number to remove (1-" + books.size() + "): ");
            String input = scanner.nextLine();
            int index = Integer.parseInt(input);

            if (index < 1 || index > books.size()) {
                throw new ArrayIndexOutOfBoundsException("Invalid book number! Please enter between 1 and " + books.size() + ".");
            }

            String removedBook = books.remove(index - 1);
            System.out.println("Book '" + removedBook + "' removed successfully!");
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Remove book operation completed.");
            showBooks();
        }
    }


    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();


        manager.showBooks();


        String[] inputs = {
                "\n",               // Empty title
                "AB\n",             // Too short
                "Mobile Development\n", // Valid
                "abc\n",            // Non-numeric removal
                "10\n",             // Out-of-range
                "1\n"               // Valid removal
        };

        for (int i = 0; i < 3; i++) {
            System.setIn(new java.io.ByteArrayInputStream(inputs[i].getBytes()));
            manager.scanner = new Scanner(System.in); // Reassign scanner after setIn
            manager.addBook();
        }

        for (int i = 3; i < inputs.length; i++) {
            System.setIn(new java.io.ByteArrayInputStream(inputs[i].getBytes()));
            manager.scanner = new Scanner(System.in); // Reassign scanner after setIn
            manager.removeBook();
        }

        System.out.println("\nProgram completed successfully.");
    }
}