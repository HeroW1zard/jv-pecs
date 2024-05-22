package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer
        extends RandomMachinesProducer implements MachineProducer<Excavator> {
    @Override
    public List<? extends Machine> get() {
        List<Excavator> excavatorsList = new ArrayList<>();
        for (int i = 0; i < getRandomAmountOfMachines(); i++) {
            excavatorsList.add(getRandomExcavator());
        }
        return excavatorsList;
    }
}
