import java.util.*;
import java.lang.*;
class User {
    String userId, username;

    public User(String userId, String username) {
        this.userId = userId;
        this.username = username;
    }

    public void placeOrder(Order order) {
        // Implement logic to place the order
        System.out.println("Order placed successfully!");
    }
}

class MenuItem {
    String itemId, name;
    double price;

    public MenuItem(String itemId, String name, double price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }
}

class Restaurant {
    String restaurantId, name;
    List<MenuItem> menuItems; 
    //declares a variable named menuItems and assigns it a reference to a List of MenuItem objects.

    public Restaurant(String restaurantId, String name) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);  //allows to add menu items
    }

    public MenuItem findMenuItemById(String itemId) {
        for (MenuItem item : menuItems) {
            if (item.itemId.equals(itemId)) {
                return item;
            }
        }
        return null;
    }
}

class Order {
    String orderId;
    User user;
    Restaurant restaurant;
    List<MenuItem> orderedItems;

    public Order(String orderId, User user, Restaurant restaurant, List<MenuItem> orderedItems) {
        this.orderId = orderId;
        this.user = user;
        this.restaurant = restaurant;
        this.orderedItems = orderedItems;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (MenuItem item : orderedItems) {
            totalPrice += item.price;
        }
        return totalPrice;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("User: " + user.username);
        System.out.println("Restaurant: " + restaurant.name);
        System.out.println("Ordered Items:");
        for (MenuItem item : orderedItems) {
            System.out.println("- " + item.name + " - $" + item.price);
        }
        System.out.println("Total Price: $" + calculateTotalPrice());
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        // ... (Read input and create User, Restaurant, and Order objects)

        // Example usage:
        User user1 = new User("U1", "Alice");
        Restaurant restaurant1 = new Restaurant("R1", "Pizza Palace");
        restaurant1.addMenuItem(new MenuItem("I1", "Margherita Pizza", 10.99));
        restaurant1.addMenuItem(new MenuItem("I2", "Pepperoni Pizza", 12.99));

        List<MenuItem> orderedItems = new ArrayList<>();
        orderedItems.add(restaurant1.findMenuItemById("I1"));
        orderedItems.add(restaurant1.findMenuItemById("I2"));

        Order order1 = new Order("O1", user1, restaurant1, orderedItems);
        order1.printOrderDetails();
    }
}
