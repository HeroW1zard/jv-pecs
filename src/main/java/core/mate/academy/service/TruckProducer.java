package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer extends RandomMachinesProducer implements MachineProducer<Truck> {
    @Override
    public List<? extends Machine> get() {
        List<Truck> trucksList = new ArrayList<>();
        for (int i = 0; i < getRandomAmountOfMachines(); i++) {
            trucksList.add(getRandomTruck());
        }
        return trucksList;
    }
}
