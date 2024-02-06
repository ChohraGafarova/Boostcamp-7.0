package classes;

public class StarbucksCustomer extends Customer {
    private int stars;

    public StarbucksCustomer(String name, String email, String password, String phoneNumber) {
        super(name, email, password, phoneNumber, "Starbucks");
        this.stars = 0;
    }

    @Override
    public void addStars(int numStars) {
        this.stars += numStars;
        System.out.println("Thanks for your purchase, " + getName() + "! You earned " + numStars + " star(s).");
    }
}
