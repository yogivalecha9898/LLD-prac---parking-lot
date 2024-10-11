package Services.Command;

import Exceptions.Exit;

public class ExitCLI implements Command {
    @Override
    public void execute(String input) throws Exit {
        throw new Exit();
    }
}
