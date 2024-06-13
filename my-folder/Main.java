import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ItemService itemService = new ItemService();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Press 1 to add an item");
            System.out.println("Press 2 to print all items");
            System.out.println("Press 3 to remove an item");
            System.out.println("Press 5 to exit");

            int action = scanner.nextInt();
            scanner.nextLine(); 

            if (action == 1) {
                addItem();
            } else if (action == 2) {
                printItems();
            } else if (action == 3) {
                removeItem();
            } else if (action == 5) {
                System.out.println("Thank you for using our application");
                break; 
            } else {
                System.out.println("Invalid input. Please enter 1, 2, 3, or 5.");
            }
        }

        System.out.println("Actions in shop are finished!");
    }

    public static void addItem() {
        System.out.println("Adding item...");
        System.out.println("Please provide item id:");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Please provide item name:");
        String name = scanner.nextLine();
        System.out.println("Please provide item cost:");
        int cost = scanner.nextInt();
        scanner.nextLine(); 
        var item = new Item(id, name, cost);
        itemService.addItem(item);
    }

    public static void printItems() {
        System.out.println("These are the items in the storage: ");
        var items = itemService.getItems();
        for (var item : items) {
            System.out.println(item.getId() + " " + item.getName() + " " + item.getCost());
        }
    }

    public static void removeItem() {
        System.out.println("Removing item...");
        System.out.println("Please provide item id:");
        int id = scanner.nextInt();
        scanner.nextLine(); 
        itemService.removeItem(id);
    }
}
