import commandpattern.TestCommand;
import strategypattern.TestStrategy;

public class Main {

    public static void main(String[] args) {
        TestStrategy test = new TestStrategy();
        test.test();
    }
}
