package core.mate.academy.service;

import java.util.List;
import core.mate.academy.model.Machine;

public interface MachineService<T extends Machine> {
    List<? extends T> getAll(Class<? extends T> type);

    void fill(List<? super T> machines, T value);

    void startWorking(List<? extends T> machines);
}
