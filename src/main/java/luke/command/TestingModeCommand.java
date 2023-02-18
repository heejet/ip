package luke.command;

import luke.Storage;
import luke.TaskList;
import luke.Ui;

public class TestingModeCommand extends Command {
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        storage.clearFiles();
        ui.printTestingMode();
    }
}
