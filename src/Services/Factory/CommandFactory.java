package Services.Factory;

import Constants.Constants;
import Entities.ParkingLots;
import Enums.Commands;
import Services.Command.*;

public class CommandFactory {
    private final ParkingLots parkingLots;
    private final DisplayFactory displayFactory;

    public CommandFactory(ParkingLots parkingLots, DisplayFactory displayFactory) {
        this.parkingLots = parkingLots;
        this.displayFactory = displayFactory;
    }

    public Command getCommandInstance(String inputCommand) {
        Commands currentCommand = Commands.getCommand(inputCommand);

        return switch (currentCommand) {
            case Commands.CREATE_PARKING_LOT -> new CreateParkingLot(parkingLots);
            case Commands.DISPLAY -> new Display(displayFactory, parkingLots);
            case Commands.UNPARK_VEHICLE -> new UnparkVehicle();
            case Commands.PARK_VEHICLE -> new ParkVehicle();
            case Commands.EXIT -> new ExitCLI();
            default ->
                // TODO: handle invalid input cases
                    (_) -> System.out.println(Constants.INVALID_COMMAND);
        };

    }
}
