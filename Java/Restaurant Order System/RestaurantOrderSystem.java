import java.io.*;
import java.util.*;

public class RestaurantOrderSystem {
    private static MenuBST menu = new MenuBST();
    private static Queue<Order> vipOrders = new LinkedList<>();
    private static Queue<Order> waitingOrders = new LinkedList<>();
    private static LinkedList<Order> activeOrders = new LinkedList<>();
    private static Stack<Order> completedOrders = new Stack<>();
    private static int nextOrderId = 1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        loadMenu();

        int choice;

        do {
            System.out.println("\n=== Restaurant Order System ===");
            System.out.println("1. Display Menu");
            System.out.println("2. Search Menu Item");
            System.out.println("3. Create Order");
            System.out.println("4. Process Next Order");
            System.out.println("5. Complete Active Order");
            System.out.println("6. View Completed Orders");
            System.out.println("7. Reorder Last Order");
            System.out.println("8. Sort Completed Orders by Total");
            System.out.println("9. Save Order History");
            System.out.println("0. Quit");
            System.out.print("Choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    menu.displayMenu();
                    break;
                case 2:
                    searchMenu(input);
                    break;
                case 3:
                    createOrder(input);
                    break;
                case 4:
                    processNextOrder();
                    break;
                case 5:
                    completeActiveOrder();
                    break;
                case 6:
                    viewCompletedOrders();
                    break;
                case 7:
                    reorderLastOrder();
                    break;
                case 8:
                    sortCompletedOrdersByTotal();
                    break;
                case 9:
                    saveOrderHistory();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);
    }

    private static void loadMenu() {
        try {
            Scanner fileScanner = new Scanner(new File("menu.txt"));

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");

                String name = parts[0];
                double price = Double.parseDouble(parts[1]);
                String category = parts[2];

                menu.insert(new MenuItem(name, price, category));
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("menu.txt was not found.");
        }
    }

    private static void searchMenu(Scanner input) {
        System.out.print("Enter item name: ");
        String name = input.nextLine();

        MenuItem item = menu.search(name);

        if (item == null) {
            System.out.println("Item not found.");
        } else {
            System.out.println(item);
        }
    }

    private static void createOrder(Scanner input) {
        System.out.print("Is this a VIP order? yes/no: ");
        boolean priority = input.nextLine().equalsIgnoreCase("yes");

        Order order = new Order(nextOrderId, priority);
        nextOrderId++;

        String itemName;

        do {
            System.out.print("Enter item name to add or done to finish: ");
            itemName = input.nextLine();

            if (!itemName.equalsIgnoreCase("done")) {
                MenuItem item = menu.search(itemName);

                if (item == null) {
                    System.out.println("Item not found.");
                } else {
                    order.addItem(item);
                    System.out.println(item.getName() + " added.");
                }
            }

        } while (!itemName.equalsIgnoreCase("done"));

        if (order.getItems().isEmpty()) {
            System.out.println("Order was empty and not added.");
        } else {
            queueOrder(order);
            System.out.println("Order created: " + order);
        }
    }

    private static void processNextOrder() {
        if (vipOrders.isEmpty() && waitingOrders.isEmpty()) {
            System.out.println("No waiting orders.");
            return;
        }

        // VIP orders skip the line
        Order order = vipOrders.isEmpty() ? waitingOrders.remove() : vipOrders.remove();
        order.setStatus("Active");
        activeOrders.add(order);

        System.out.println("Now preparing: " + order);
    }

    private static void completeActiveOrder() {
        if (activeOrders.isEmpty()) {
            System.out.println("No active orders.");
            return;
        }

        Order order = activeOrders.removeFirst();
        order.setStatus("Completed");
        completedOrders.push(order);

        System.out.println("Completed: " + order);
    }

    private static void viewCompletedOrders() {
        if (completedOrders.isEmpty()) {
            System.out.println("No completed orders.");
            return;
        }

        for (Order order : completedOrders) {
            System.out.println(order);
        }
    }

    private static void reorderLastOrder() {
        if (completedOrders.isEmpty()) {
            System.out.println("No completed orders to reorder.");
            return;
        }

        Order lastOrder = completedOrders.peek();
        Order newOrder = new Order(nextOrderId, lastOrder.isPriority());
        nextOrderId++;

        for (MenuItem item : lastOrder.getItems()) {
            newOrder.addItem(item);
        }

        queueOrder(newOrder);
        System.out.println("Reordered as: " + newOrder);
    }

    private static void queueOrder(Order order) {
        if (order.isPriority()) {
            vipOrders.add(order);
        } else {
            waitingOrders.add(order);
        }
    }

    private static void sortCompletedOrdersByTotal() {
        ArrayList<Order> sortedOrders = new ArrayList<>(completedOrders);

        sortedOrders.sort(Comparator.comparingDouble(Order::getTotal));

        for (Order order : sortedOrders) {
            System.out.println(order);
        }
    }

    private static void saveOrderHistory() {
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("order_history.txt"));

            for (Order order : completedOrders) {
                writer.println(order);

                for (MenuItem item : order.getItems()) {
                    writer.println("  - " + item);
                }

                writer.println();
            }

            writer.close();
            System.out.println("Order history saved.");
        } catch (IOException e) {
            System.out.println("Could not save order history.");
        }
    }
}