package luke.command;

import luke.Storage;
import luke.TaskList;
import luke.Ui;

public class OutOfBoundsCommand extends Command {
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.printOutOfBounds();
    }
}
