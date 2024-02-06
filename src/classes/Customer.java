package classes;

public abstract class Customer {
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String company;

    public Customer(String name, String email, String password, String phoneNumber, String company) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public abstract void addStars(int numStars);
}
