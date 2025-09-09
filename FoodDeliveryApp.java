import java.util.Scanner;

class FoodItem {
    private String itemName;
    private double price;
    private String category;
    public void setItemName(String itemName) {
        if (itemName != null && !itemName.trim().isEmpty()) {
            this.itemName = itemName;
        } else {
            System.out.println("Error: Item name cannot be null or empty.");
        }
    }

 
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative.");
        }
    }

 
    public void setCategory(String category) {
        if (category != null && !category.trim().isEmpty()) {
            this.category = category;
        } else {
            System.out.println("Error: Category cannot be null or empty.");
        }
    }

     
    public String getItemName() {
        return itemName;
    }

 
    public double getPrice() {
        return price;
    }

    
    public String getCategory() {
        return category;
    }
 
    public void displayDetails() {
        System.out.println("Food Item: " + itemName);
        System.out.println("Price: Rs." + price);
        System.out.println("Category: " + category);
        System.out.println("------------------------");
    }
}

public class FoodDeliveryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        FoodItem item1 = new FoodItem();
        FoodItem item2 = new FoodItem();
        FoodItem item3 = new FoodItem();

         
        System.out.println("Enter details for Food Item 1:");
        System.out.print("Enter Item Name: ");
        item1.setItemName(sc.nextLine());
        System.out.print("Enter Price: ");
        item1.setPrice(sc.nextDouble());
        sc.nextLine(); 
        System.out.print("Enter Category: ");
        item1.setCategory(sc.nextLine());

 
        System.out.println("\nEnter details for Food Item 2:");
        System.out.print("Enter Item Name: ");
        item2.setItemName(sc.nextLine());
        System.out.print("Enter Price: ");
        item2.setPrice(sc.nextDouble());
        sc.nextLine();  
        System.out.print("Enter Category: ");
        item2.setCategory(sc.nextLine());

 
        System.out.println("\nEnter details for Food Item 3:");
        System.out.print("Enter Item Name: ");
        item3.setItemName(sc.nextLine());
        System.out.print("Enter Price: ");
        item3.setPrice(sc.nextDouble());
        sc.nextLine();  
        System.out.print("Enter Category: ");
        item3.setCategory(sc.nextLine());

 
        System.out.println("\n=== Food Menu ===");
        item1.displayDetails();
        item2.displayDetails();
        item3.displayDetails();

 
        System.out.println("Updating price of Food Item 2...");
        System.out.print("Enter new price: ");
        double newPrice = sc.nextDouble();
        item2.setPrice(newPrice);
 
        System.out.println("\n=== Updated Food Item 2 ===");
        item2.displayDetails();

        sc.close();
    }
}
