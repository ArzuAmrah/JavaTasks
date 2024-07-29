package enumTask;

public enum Currency {

    USD(1.0),
    EUR(1.1),
    GBP(0.8),
    AZN(1.7);

    private double rateToUSD;

    Currency(double rateToUSD){
        this.rateToUSD = rateToUSD;
    }

    public double getRateToUSD(){
        return rateToUSD;
    }

    @Override
    public String toString() {
        return this.name() + " ( 1 USD = " + rateToUSD + this.name() + ")";

    }
}
