package dao;

public class Address {
    private String street;
    private String city;
    private String zip;

    public Address(){
    }

    public Address(String street, String city, String zip) {
        this.street = street;
        this.city = city;
        this.zip = zip;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(" Street : ");
        s.append(this.street);
        s.append(" City : ");
        s.append(this.city);
        s.append(" Zip : ");
        s.append(this.zip);
        return s.toString();
    }
}
