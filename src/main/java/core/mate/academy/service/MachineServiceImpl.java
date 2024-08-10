package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
        MachineProducer<? extends T> machineProducer = null;
        if (type.equals(Bulldozer.class)) {
            machineProducer = (MachineProducer<? extends T>) new BulldozerProducer();
        } else if (type.equals(Excavator.class)) {
            machineProducer = (MachineProducer<? extends T>) new ExcavatorProducer();
        } else if (type.equals(Truck.class)) {
            machineProducer = (MachineProducer<? extends T>) new TruckProducer();
        }

        return machineProducer != null ? (List<T>) machineProducer.get() : List.of();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}
