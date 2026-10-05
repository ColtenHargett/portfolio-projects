import java.util.ArrayList;

public class Order {
    private int id;
    private ArrayList<MenuItem> items;
    private boolean priority;
    private String status;

    public Order(int id, boolean priority) {
        this.id = id;
        this.priority = priority;
        this.items = new ArrayList<>();
        this.status = "Waiting";
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double getTotal() {
        double total = 0;

        for (MenuItem item : items) {
            total += item.getPrice();
        }

        return total;
    }

    public int getId() {
        return id;
    }

    public boolean isPriority() {
        return priority;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public String toString() {
        return "Order #" + id +
                " | Status: " + status +
                " | Priority: " + priority +
                " | Total: $" + String.format("%.2f", getTotal());
    }
}