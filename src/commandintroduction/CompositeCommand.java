package commandintroduction;

import java.util.ArrayList;
import java.util.List;

class CompositeCommand implements Command{

    List<Command> commands = new ArrayList<>();

    public void add(Command command)
    {
        commands.add(command);
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }

    @Override
    public void undo() {
        commands.reversed().forEach(Command::undo);
    }
}
