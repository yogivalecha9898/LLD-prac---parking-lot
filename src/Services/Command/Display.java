package Services.Command;

import Constants.Constants;
import Entities.ParkingLots;
import Exceptions.Exit;
import Services.Factory.DisplayFactory;

public class Display implements Command {
    private final DisplayFactory displayFactory;
    private final ParkingLots parkingLots;

    public Display(DisplayFactory displayFactory, ParkingLots parkingLots) {
        this.displayFactory = displayFactory;
        this.parkingLots = parkingLots;
    }

    @Override
    public void execute(String input) throws Exit {
        String[] data = input.split(Constants.SINGLE_SPACE);

        DisplayCommand command = displayFactory.getDisplayCommand(data[1]);
        command.execute(data[2], parkingLots);
    }
}
