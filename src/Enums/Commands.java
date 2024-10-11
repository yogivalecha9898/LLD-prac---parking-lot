package Enums;

public enum Commands {
    DISPLAY("display"),
    CREATE_PARKING_LOT("create_parking_lot"),
    PARK_VEHICLE("park_vehicle"),
    UNPARK_VEHICLE("unpark_vehicle"),
    EXIT("exit"),
    INVALID_COMMAND("invalid_command");

    private final String value;

    Commands(String value) {
        this.value = value;
    }

    public static Commands getCommand(String inputCommand) {
        for(Commands command : Commands.values()) {
            if(command.getValue().equals(inputCommand)) {
                return command;
            }
        }

        return INVALID_COMMAND;
    }

    public String getValue() {
        return this.value;
    }
}
