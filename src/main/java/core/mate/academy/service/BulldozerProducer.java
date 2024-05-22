package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer
        extends RandomMachinesProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<? extends Machine> get() {
        List<Bulldozer> bulldozersList = new ArrayList<>();
        for (int i = 0; i < getRandomAmountOfMachines(); i++) {
            bulldozersList.add(getRandomBulldozer());
        }
        return bulldozersList;
    }
}
