public class Main {
    public static void main(String[] args) {
        book book1 = new book("Ralph the explorer", "Partrick", 500);
        book book2 = new book("Shote the pirates", "Eunson", 300);
        book book3 = new book("doniel the korean", "Nicholai", 600);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book1.borrowBook();
        book1.displayInfo();

        book1.returnBook();
        book1.displayInfo();
    }
}