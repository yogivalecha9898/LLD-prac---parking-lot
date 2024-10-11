package Services.Command;

import Exceptions.Exit;

public class UnparkVehicle implements Command {
    @Override
    public void execute(String input) throws Exit {
        System.out.println("un park vehicle");
    }
}
