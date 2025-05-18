public class Truck extends Vehicle implements HasWheels, CarriesCargo {
    private int nunberOfWheels;
    private String cargoName;

    public Truck(String name, int wheels, String cargo) {
        super(name);
        this.nunberOfWheels = wheels;
        this.cargoName = cargo;
    };

    @Override
    public int getNumberOfWheels() {
        return this.nunberOfWheels;
    };

    @Override
    public String loadCargo() {
        return this.cargoName;
    };
}
