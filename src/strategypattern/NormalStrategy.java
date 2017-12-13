package strategypattern;

// Normal billing strategy (unchanged price)
public class NormalStrategy implements BillingStrategy {

    @Override
    public double getActPrice(final double rawPrice) {
        return rawPrice;
    }

}
