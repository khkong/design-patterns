package commandpattern;

public class TestCommand {

    public void test() {
        Light light = new Light();
        TurnOffLightCommand switchDown = new TurnOffLightCommand(light);
        TurnOnLightCommand switchUp = new TurnOnLightCommand(light);

        Switch s = new Switch(switchUp, switchDown);
        s.flipUp();
        s.flipDown();
    }

}
