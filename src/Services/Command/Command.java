package Services.Command;

import Exceptions.Exit;

public interface Command {
    void execute(String input) throws Exit;
}
