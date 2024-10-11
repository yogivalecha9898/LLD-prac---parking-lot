package Services.Command;

import Entities.ParkingLots;
import Entities.Vehicle;

public interface DisplayCommand {
    void execute(String vehicle, ParkingLots parkingLots);
}
