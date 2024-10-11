package Services.Command;

import Entities.BruteForceParkingLot;
import Entities.ParkingLot;
import Entities.ParkingLots;
import Services.Strategy.BruteForceAvailability;

public class FreeCount implements DisplayCommand {
//    No. of free slots for CAR on Floor 1: 3
    @Override
    public void execute(String vehicle, ParkingLots parkingLots) {
        BruteForceAvailability bruteForceAvailability = new BruteForceAvailability(parkingLots);
        bruteForceAvailability.getFreeSlotCounts(vehicle);
    }
}
