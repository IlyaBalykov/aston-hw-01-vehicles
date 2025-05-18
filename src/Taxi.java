public class Taxi extends Vehicle implements HasWings {

    private int nunberOfWings;

    public Taxi(String name, int wings) {
        super(name);
        this.nunberOfWings = wings;
    };

     @Override
    public int getNumberOfWings() {
        return this.nunberOfWings;
    };
}
