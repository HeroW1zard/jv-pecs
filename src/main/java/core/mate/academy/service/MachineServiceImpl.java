package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machinesList = new ArrayList<>();
        switch (type.getSimpleName()) {
            case "Bulldozer" -> machinesList.addAll(new BulldozerProducer().get());
            case "Excavator" -> machinesList.addAll(new ExcavatorProducer().get());
            case "Truck" -> machinesList.addAll(new TruckProducer().get());
            default -> {
                return Collections.emptyList();
            }
        }
        return machinesList;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        Collections.fill(machines, value);
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
