package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MachineServiceImpl implements MachineService<Machine> {
    private BulldozerProducer bulldozerProducer = new BulldozerProducer();
    private ExcavatorProducer excavatorProducer = new ExcavatorProducer();
    private TruckProducer truckProducer = new TruckProducer();

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        List<Machine> machinesList = new ArrayList<>();
        switch (type.getSimpleName()) {
            case "Bulldozer" -> machinesList.addAll(bulldozerProducer.get());
            case "Excavator" -> machinesList.addAll(excavatorProducer.get());
            case "Truck" -> machinesList.addAll(truckProducer.get());
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
