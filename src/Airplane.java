public class Airplane extends Vehicle implements HasWheels, HasPropeller, HasWings, CarriesCargo {

    private int nunberOfWheels;
    private int nunberOfWings;
    private int nunberOfPropellers;
    private String cargoName;

    public Airplane(String name, int wheels, int propellers, int wings, String cargo) {
        super(name);
        this.nunberOfWheels = wheels;
        this.nunberOfWings = wings;
        this.nunberOfPropellers = propellers;
        this.cargoName = cargo;
    };

    @Override
    public int getNumberOfWheels() {
        return this.nunberOfWheels;
    };

    @Override
    public int getNumberOfWings() {
        return this.nunberOfWings;
    };

    @Override
    public int getNumberOfPropellers() {
        return this.nunberOfPropellers;
    };

    @Override
    public String loadCargo() {
        return this.cargoName;
    };
}
