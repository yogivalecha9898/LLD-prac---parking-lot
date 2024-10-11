package Services.Command;

import Constants.Constants;
import Entities.BruteForceParkingLot;
import Entities.ParkingLot;
import Entities.ParkingLots;

public class CreateParkingLot implements Command {
    private final ParkingLots parkingLots;

    public CreateParkingLot(ParkingLots parkingLots) {
        this.parkingLots = parkingLots;
    }

    @Override
    public void execute(String input) {
        String[] data = input.split(Constants.SINGLE_SPACE);
        String parkingLotId = data[1];
        Integer floors = Integer.valueOf(data[2]);
        Integer lots = Integer.valueOf(data[3]);
        ParkingLot parkingLot = new BruteForceParkingLot(parkingLotId, floors, lots);
        parkingLots.addParkingLot(parkingLot);

        String info = String.format("Created parking lot with %s floors and %s slots per floor", floors, lots);

        System.out.println(info);
    }
}
