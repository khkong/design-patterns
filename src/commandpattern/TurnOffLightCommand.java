package commandpattern;

public class TurnOffLightCommand implements Command {

    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override public void excute() {
        light.turnOff();
    }
}
