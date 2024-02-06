import classes.CoffeeShop;
import classes.NeroCustomer;
import classes.StarbucksCustomer;

public class Main {
    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop();

        StarbucksCustomer starbucksCustomer = new StarbucksCustomer("John Doe", "johndoe@example.com", "password123", "555-555-5555");
        coffeeShop.addCustomer(starbucksCustomer);

        NeroCustomer neroCustomer = new NeroCustomer("Jane Doe", "janedoe@example.com", "password456", "555-555-5556");
        coffeeShop.addCustomer(neroCustomer);

        coffeeShop.processPurchase("John Doe", 5);
        coffeeShop.processPurchase("Jane Doe", 10);
        coffeeShop.processPurchase("Jim Smith", 3);
    }
}
