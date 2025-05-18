public class Tanker extends Vehicle implements HasPropeller, CarriesCargo {
    private int nunberOfPropellers;
    private String cargoName;

    public Tanker (String name, int propellers,String cargo) {
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
