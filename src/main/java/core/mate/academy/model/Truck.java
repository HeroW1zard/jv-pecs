package core.mate.academy.model;

public class Truck extends Machine {
    private String brand;
    private String model;
    private int enginePower;
    private int gasTankAmount;
    private double mileage;

    public Truck() {
    }

    public Truck(String name, String color, String brand, String model,
                 int enginePower, int gasTankAmount, double mileage) {
        super(name, color);
        this.brand = brand;
        this.model = model;
        this.enginePower = enginePower;
        this.gasTankAmount = gasTankAmount;
        this.mileage = mileage;
    }

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

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getGasTankAmount() {
        return gasTankAmount;
    }

    public void setGasTankAmount(int gasTankAmount) {
        this.gasTankAmount = gasTankAmount;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
