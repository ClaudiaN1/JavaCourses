package bank;

public class BankAcount {

    private Person owner;

    private double sold;

    private int id;

    public BankAcount(Person owner, double sold, int id) {
        this.owner = owner;
        this.sold = sold;
        this.id = id;
    }

    @Override
    public String toString() {
       return String.format("\nPERSON : %s\nSOLD : %s\nID: %s",
                owner,
                sold,
                id);


    }

}
