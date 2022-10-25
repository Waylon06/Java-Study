package question05;

public class CheryCar implements Car {
    String name;
    int price;

    @Override
    public void carname() {
        this.name = "Chery";
        System.out.println(name);
    }

    @Override
    public void carprice() {
        this.price = 200000;
        System.out.println(price);
    }
}
