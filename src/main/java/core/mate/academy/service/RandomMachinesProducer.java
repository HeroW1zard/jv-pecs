package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Truck;
import core.mate.academy.service.enums.Brand;
import core.mate.academy.service.enums.Color;
import core.mate.academy.service.enums.Model;
import core.mate.academy.service.enums.Name;
import java.util.Locale;
import java.util.Random;

public class RandomMachinesProducer {
    private static final int MAX_AMOUNT_OF_MACHINES = 10;
    private static final int MIN_AMOUNT_OF_MACHINES = 1;
    private static final int MIN_VALUE_BULLDOZZER_EP = 100;
    private static final int MAX_VALUE_BULLDOZZER_EP = 700;
    private static final int MIN_VOLUME_BULLDOZZER_TANK = 100;
    private static final int MAX_VOLUME_BULLDOZZER_TANK = 2000;
    private static final int MIN_VALUE_EXCAVATOR_EP = 10;
    private static final int MAX_VALUE_EXCAVATOR_EP = 2000;
    private static final int MIN_VOLUME_EXCAVATOR_TANK = 50;
    private static final int MAX_VOLUME_EXCAVATOR_TANK = 2000;
    private static final int MIN_VALUE_TRUCK_EP = 100;
    private static final int MAX_VALUE_TRUCK_EP = 1000;
    private static final int MIN_VOLUME_TRUCK_TANK = 100;
    private static final int MAX_VOLUME_TRUCK_TANK = 1000;
    private Random random = new Random();

    protected Bulldozer getRandomBulldozer() {
        Bulldozer bulldozer = new Bulldozer();
        bulldozer.setName(getRandomName());
        bulldozer.setColor(getRandomColor());
        bulldozer.setBrand(getRandomBrand());
        bulldozer.setModel(getRandomModel());
        bulldozer.setEnginePower(getRandomEnginePower(MIN_VALUE_BULLDOZZER_EP,
                MAX_VALUE_BULLDOZZER_EP));
        bulldozer.setGasTankAmount(getRandomTankVolume(MIN_VOLUME_BULLDOZZER_TANK,
                MAX_VOLUME_BULLDOZZER_TANK));
        bulldozer.setEngineHours(getRandomEngineHours());
        return bulldozer;
    }
    
    protected Excavator getRandomExcavator() {
        Excavator excavator = new Excavator();
        excavator.setName(getRandomName());
        excavator.setColor(getRandomColor());
        excavator.setBrand(getRandomBrand());
        excavator.setModel(getRandomModel());
        excavator.setEnginePower(getRandomEnginePower(MIN_VALUE_EXCAVATOR_EP,
                MAX_VALUE_EXCAVATOR_EP));
        excavator.setGasTankAmount(getRandomTankVolume(MIN_VOLUME_EXCAVATOR_TANK,
                MAX_VOLUME_EXCAVATOR_TANK));
        excavator.setEngineHours(getRandomEngineHours());
        return excavator;
    }

    protected Truck getRandomTruck() {
        Truck truck = new Truck();
        truck.setName(getRandomName());
        truck.setColor(getRandomColor());
        truck.setBrand(getRandomBrand());
        truck.setModel(getRandomModel());
        truck.setEnginePower(getRandomEnginePower(MIN_VALUE_TRUCK_EP,
                MAX_VALUE_TRUCK_EP));
        truck.setGasTankAmount(getRandomTankVolume(MIN_VOLUME_TRUCK_TANK,
                MAX_VOLUME_TRUCK_TANK));
        truck.setMileage(getRandomMileage());
        return truck;
    }

    protected int getRandomAmountOfMachines() {
        return random.nextInt(MIN_AMOUNT_OF_MACHINES,MAX_AMOUNT_OF_MACHINES);
    }

    private String getRandomName() {
        int index = random.nextInt(Name.values().length);
        return String.valueOf(Name.values()[index]);
    }

    private String getRandomColor() {
        int index = random.nextInt(Color.values().length);
        return String.valueOf(Color.values()[index]);
    }

    private String getRandomBrand() {
        int index = random.nextInt(Brand.values().length);
        return String.valueOf(Brand.values().length);
    }

    private String getRandomModel() {
        int index = random.nextInt(Model.values().length);
        return String.valueOf(Model.values().length);
    }

    private int getRandomEnginePower(int minPower, int maxPower) {
        return random.nextInt(minPower, maxPower);
    }

    private int getRandomTankVolume(int minAmount, int maxAmount) {
        return random.nextInt(minAmount, maxAmount);
    }

    private double getRandomEngineHours() {
        double engineHours = Math.round(random.nextDouble() * 10000) / 100.0;
        return Double.parseDouble(String.format(Locale.US, "%.2f", engineHours));
    }

    private double getRandomMileage() {
        double mileage = Math.round(random.nextDouble() * 1000000) / 100.0;
        return Double.parseDouble(String.format(Locale.US, "%.2f", mileage));
    }

}
