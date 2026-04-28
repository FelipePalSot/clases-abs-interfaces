package ejemploAbsInterfaces;

public abstract class Vehicle {
    private String brand;
    private String model;
    private int year;
    private  Color color;
    private VehicleStatus vehicleStatus;

    public Vehicle(String brand, String model, int year, Color color, VehicleStatus vehicleStatus) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.vehicleStatus = vehicleStatus;
    }

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

//    public void start(){
//        System.out.println("Encedido el vehiculo");
//    }

    public void stop(){
        System.out.println("Parado el vehiculo");
    }

    public abstract void drive();
    //aca no se pone llaves por
    // que lleva la palabra reservada "abstract"

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {
        int currentYear = java.time.Year.now().getValue();

        if(year<1886 || year > currentYear + 2){
            throw new IllegalArgumentException("Año invaliddo");
        }

        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color=" + color +
                ", vehicleStatus=" + vehicleStatus +
                '}';
    }
}

