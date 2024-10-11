package Services.Factory;

import Constants.Constants;
import Enums.Display;
import Services.Command.DisplayCommand;
import Services.Command.FreeCount;
import Services.Command.FreeSlots;
import Services.Command.OccupiedSlots;

public class DisplayFactory {
    public DisplayCommand getDisplayCommand(String inputCommand) {
        Display display = Display.getDisplay(inputCommand);

        return switch (display) {
            case Display.FREE_COUNT -> new FreeCount();
            case Display.FREE_SLOTS -> new FreeSlots();
            case Display.OCCUPIED_SLOTS -> new OccupiedSlots();
            default ->
                // TODO: handle invalid input cases
                    (_, _) -> System.out.println(Constants.INVALID_COMMAND);
        };

//        return (_, _) -> System.out.println(Constants.INVALID_COMMAND + "from display command 2");
    }
}
