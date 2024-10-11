package Services.Strategy;

import Constants.Constants;
import Entities.ParkingLots;
import Exceptions.Exit;
import Services.Command.Command;
import Services.Factory.CommandFactory;
import Services.Factory.DisplayFactory;

import java.util.Scanner;

public class InputCLI implements Input {
    @Override
    public void takeInput() {
        Scanner sc = new Scanner(System.in);
        ParkingLots parkingLots = new ParkingLots();
        DisplayFactory displayFactory = new DisplayFactory();
        CommandFactory commandFactory = new CommandFactory(parkingLots, displayFactory);

        try {
            while (true) {
                String input = sc.nextLine();
                String[] inputSplit = input.split(Constants.SINGLE_SPACE);
                Command command = commandFactory.getCommandInstance(inputSplit[0]);

                command.execute(input);
            }
        } catch (Exit _) {}
    }
}
