package CarRentalSystem.com;

public class carData {
    String[] name;
    String[] price;
    String[] date;
    boolean[] isLoan;
    long[] loanSize;

    public carData(int maxSize) {
        this.name = new String[maxSize];
        this.price = new String[maxSize];
        this.date = new String[maxSize];
        this.isLoan = new boolean[maxSize];
        this.loanSize = new long[maxSize];
    }

}


