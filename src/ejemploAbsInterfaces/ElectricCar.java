package ejemploAbsInterfaces;

public class ElectricCar extends Vehicle implements Electric, SelfDriving{
    private int batteryLevel;

    public ElectricCar(String brand, String model, int year, Color color, VehicleStatus vehicleStatus, int batteryLevel) {
        super(brand, model, year, color, vehicleStatus);
        this.batteryLevel = batteryLevel;
    }

    public ElectricCar(String brand, String model, int year, int batteryLevel) {
        super(brand, model, year);
        this.batteryLevel = batteryLevel;
    }

    public ElectricCar(String brand, String model, int year) {
        super(brand, model, year);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void drive() {
        System.out.println("El auto electrico esta en marcha");
    }

    @Override
    public void chargeBattery() {
        batteryLevel = MAX_BATTERY_CAPACITY;
        System.out.println("La bateria esta cargada al 100%");
    }

    @Override
    public void activateAutopilot() {
        System.out.println("Modo piloto automatico activado");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batteryLevel=" + batteryLevel +
                '}' + super.toString();
    }
}
