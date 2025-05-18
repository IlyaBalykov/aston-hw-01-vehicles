public class Boat extends Vehicle implements HasPropeller, CarriesCargo {

    private int nunberOfPropellers;
    private String cargoName;

    public Boat(String name, int propellers, String cargo) {
        super(name);
        this.nunberOfPropellers = propellers;
        this.cargoName = cargo;
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
