package Services.Strategy;

import Entities.Vehicle;

import java.util.List;

public interface Availability {
    Integer getFreeSlotCounts(String vehicle);

    List<Integer> getFreeSlots(String vehicle);

    List<Integer> getOccupiedSlots(String vehicle);
}
