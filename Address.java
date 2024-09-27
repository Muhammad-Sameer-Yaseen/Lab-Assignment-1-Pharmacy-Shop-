public class Address {
    String street;
    String city;
    String postalCode;
    public Address(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void displayAddress() {
        System.out.println("Street: " + getStreet());
        System.out.println("City: " + getCity());
        System.out.println("Postal Code: " + getPostalCode());
    }
}