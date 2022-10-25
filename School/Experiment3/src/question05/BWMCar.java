package question05;

public class BWMCar implements Car {
    String name;
    int price;

    @Override
    public void carname() {
        this.name = "BWM";
        System.out.println(name);
    }

    @Override
    public void carprice() {
        this.price = 1000000;
        System.out.println(price);
    }
}
