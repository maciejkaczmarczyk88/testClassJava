package task.Zada5;

public class BankAccount {
    private String firstName;
    private String lastName;
    private String pesel;
    private double balane;

    public BankAccount(String firstName, String lastName, String pesel, double balane) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.balane = balane;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public double getBalane() {
        return balane;
    }

    public void setBalane(double balane) {
        this.balane = balane;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", balane=" + balane +
                '}';
    }
}
