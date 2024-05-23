package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

public interface MachineProducer<Machine> {

    List<? extends Machine> get();
}
