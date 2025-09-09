***import java.util.Scanner;***

***class Restaurant{***

***String restaurantName;***

***String lastOrderedItem;***

***static int totalOrders;***

***public static void placeOrder(String itemName, int quantity){***

***Scanner sc=new Scanner(System.in);***

***System.out.println("Enter Restaurant Name: ");***

***restaurantName=sc.nextLine();***

***System.out.println("Enter last ordered item: ");***

***lastOrderedItem=sc.nextLine();***

***totalOrders+=quantity;***

***System.out.println("Total Orders: ");***

***totalOrders=sc.nextInt();***



***}***

***System.out.println("Total Orders: "+totalOrders);***





***}***

