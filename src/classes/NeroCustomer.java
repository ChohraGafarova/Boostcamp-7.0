package classes;

public class NeroCustomer extends Customer {
    public NeroCustomer(String name, String email, String password, String phoneNumber) {
        super(name, email, password, phoneNumber, "Nero");
    }

    @Override
    public void addStars(int numStars) {
    }
}
