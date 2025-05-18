public class Helicopter extends Vehicle implements HasWheels, HasPropeller, CarriesCargo {
    private int nunberOfWheels;
    private int nunberOfPropellers;
    private String cargoName;

    public Helicopter(String name, int wheels, int propellers, String cargo) {
        super(name);
        this.nunberOfWheels = wheels;
        this.nunberOfPropellers = propellers;
        this.cargoName = cargo;
    };

    @Override
    public int getNumberOfWheels() {
        return this.nunberOfWheels;
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
