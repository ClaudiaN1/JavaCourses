package test_18_11_10;

public class Movie {

    private String name;
    private int year;
    private float ticketPrice ;

    public Movie(String name, int year, float ticketPrice) {
        this.name = name;
        this.year = year;
        this.ticketPrice = ticketPrice;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    @Override
    public String toString() {
        return String.format(
                "\nName: %s\nYear: %s\nTicketPrice: %s",
                name,
                year,
                ticketPrice);
    }
}
