public abstract class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Airplane a1 = new Airplane("SomeVehicle",6, 2, 2,"post");
        Airplane a2 = new Airplane("SomePassengerVehicle",4, 2, 2,"peoples");

        System.out.println(a1.getName());
        System.out.println(a1.getNumberOfPropellers());
        System.out.println(a1.getNumberOfWheels());
        System.out.println(a1.loadCargo());

        System.out.println(a2.getName());
        System.out.println(a2.getNumberOfPropellers());
        System.out.println(a2.getNumberOfWheels());
        System.out.println(a2.loadCargo());

        Tanker t1 = new Tanker("SomeTanker", 2, "oil");
        System.out.println(t1.getName());
        System.out.println(t1.getNumberOfPropellers());
        System.out.println(t1.loadCargo());
    }
}