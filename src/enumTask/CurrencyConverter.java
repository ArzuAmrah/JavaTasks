package enumTask;

public class CurrencyConverter {

    public static  double convertFromUSD(double amount, Currency toCurrency){
        return amount * toCurrency.getRateToUSD();
    }

    public static double convertToUSD(double amount, Currency fromCurrency){
        return amount / fromCurrency.getRateToUSD();
    }
}
