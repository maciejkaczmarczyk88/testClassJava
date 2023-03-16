package task.Zada5;

public class Adres {
    private String street;
    private int numberBulding;
    private int numberFlat;
    private String city;
    private String zipCode;

    public Adres(String street, int numberBulding, int numberFlat, String city, String zipCode) {
        this.street = street;
        this.numberBulding = numberBulding;
        this.numberFlat = numberFlat;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumberBulding() {
        return numberBulding;
    }

    public void setNumberBulding(int numberBulding) {
        this.numberBulding = numberBulding;
    }

    public int getNumberFlat() {
        return numberFlat;
    }

    public void setNumberFlat(int numberFlat) {
        this.numberFlat = numberFlat;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "street='" + street + '\'' +
                ", numberBulding=" + numberBulding +
                ", numberFlat=" + numberFlat +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
