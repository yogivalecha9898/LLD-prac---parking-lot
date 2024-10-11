package Services.Command;

import Exceptions.Exit;

public class ParkVehicle implements Command {
    @Override
    public void execute(String input) throws Exit {
        System.out.println("I am responsible for parking vehicles");
    }
}
