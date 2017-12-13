package commandpattern;

public class Switch {
    private Command filpOnCommand;
    private Command filpDownCommand;

    public Switch(Command filpOnCommand,Command filpDownCommand) {
        this.filpOnCommand = filpOnCommand;
        this.filpDownCommand = filpDownCommand;
    }

    public void flipUp(){
        filpOnCommand.excute();
    }

    public void flipDown(){
        filpDownCommand.excute();
    }
}
