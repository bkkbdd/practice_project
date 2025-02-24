public class Slice_o_Heaven {
    public String storeName;
    public String storeAddress;
    public String storeEmail;
    public long storePhone;
    public String storeMenu;
    public String pizzaIngredients;
    public double pizzaPrice;
    public String sides;
    public String drinks;
    private String orderID;
    private double orderTotal;

    public void takeOrder(String id, String ingredients, String side, String drink) {
        orderID = id;
        pizzaIngredients = ingredients;
        sides = side;
        drinks = drink;
        orderTotal = pizzaPrice;
        if (sides != null && !sides.isEmpty()) {
            orderTotal += 5; 
        }
        if (drinks != null && !drinks.isEmpty()) {
            orderTotal += 3; 
        }
        System.out.println("Order " + orderID + " has been accepted!");
        makePizza();
        printReceipt();
    }

    public void makePizza() {
        System.out.println("Preparing pizza with " + pizzaIngredients + ".");
        try {
            Thread.sleep(3000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pizza is ready!");
    }

    public void printReceipt() {
        System.out.println("********** RECEIPT **********");
        System.out.println("Order ID: " + orderID);
        System.out.println("Pizza Ingredients: " + pizzaIngredients);
        if (sides != null && !sides.isEmpty()) {
            System.out.println("Sides: " + sides);
        }
        if (drinks != null && !drinks.isEmpty()) {
            System.out.println("Drinks: " + drinks);
        }
        System.out.println("Total: $" + orderTotal);
        System.out.println("********************************");
    }
}