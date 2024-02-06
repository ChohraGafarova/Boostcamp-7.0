package classes;
import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    private List<Customer> customers;

    public CoffeeShop() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void processPurchase(String name, int numStars) {
        for (int i = 0; i < customers.size(); i++) {
            if (name.equals(customers.get(i).getName())) {
                customers.get(i).addStars(numStars);
                return;
            }
        }

        System.out.println("Sorry, we couldn't find a customer with that name.");
    }

}