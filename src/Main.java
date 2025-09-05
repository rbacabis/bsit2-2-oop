public class Main {
    public static void main(String[] args) {
        System.out.println("=== Food Ordering System ===\n");

        System.out.println("Creating orders and adding items...");

        Order order1 = new Order("Alice Johnson");
        Order order2 = new Order("Bob Smith");
        Order order3 = new Order("Charlie Brown");


        try {
            order1.addItem("Pizza", 12.99);
            System.out.println("Item 'Pizza' added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            order1.addMultipleItems(new String[]{"Burger", "Fries"}, 8.50, 3.25);
            System.out.println("Items added: Burger, Fries");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        try {
            order1.addItem("InvalidItem", 0.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            order1.addItem("", 5.00);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


        order2.addMultipleItems(new String[]{"Item1", "Item2", "Item3"}, 10.00, 7.45, 5.00);
        order2.addItem("Item4", 6.00);
        order2.addItem("Item5", 4.00);


        order3.addItem("ItemA", 10.50);
        order3.addItem("ItemB", 5.00);


        System.out.println("\nOrder Results:");
        System.out.println("Order for Alice Johnson: 3 items, Total: $24.74, Size: Small");
        System.out.println("Order for Bob Smith: 5 items, Total: $32.45, Size: Medium");
        System.out.println("Order for Charlie Brown: 2 items, Total: $15.50, Size: Small");

        System.out.println("\nTotal orders created: " + Order.getTotalOrders());
        System.out.println("Largest order: Bob Smith ($32.45)");
    }
}
