package Services.Command;

import Entities.ParkingLots;
import Services.Strategy.BruteForceAvailability;

public class FreeSlots implements DisplayCommand {
    @Override
    public void execute(String vehicle, ParkingLots parkingLots) {
        BruteForceAvailability bruteForceAvailability = new BruteForceAvailability(parkingLots);
        bruteForceAvailability.getFreeSlots(vehicle);
    }
}
