package core.mate.academy.model;

public class Excavator extends Machine {
    private String brand;
    private String model;
    private int enginePower;
    private int gasTankAmount;
    private double engineHours;

    public Excavator() {
    }

    public Excavator(String name, String color, String brand, String model,
                     int enginePower, int gasTankAmount, double engineHours) {
        super(name, color);
        this.brand = brand;
        this.model = model;
        this.enginePower = enginePower;
        this.gasTankAmount = gasTankAmount;
        this.engineHours = engineHours;
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

    public double getEngineHours() {
        return engineHours;
    }

    public void setEngineHours(double engineHours) {
        this.engineHours = engineHours;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
