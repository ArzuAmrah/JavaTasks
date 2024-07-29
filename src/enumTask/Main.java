package enumTask;

public class Main {
    public static void main(String[] args) {

        for(Currency currency : Currency.values()){
            System.out.println(currency);

            double usdAmount  = 100;

            System.out.println("\n" + usdAmount + " USD in EUR: " + CurrencyConverter.convertFromUSD(usdAmount, Currency.EUR));
            System.out.println(usdAmount + " USD in GBP: " + CurrencyConverter.convertFromUSD(usdAmount, Currency.GBP));
            System.out.println(usdAmount + " USD in AZN: " + CurrencyConverter.convertFromUSD(usdAmount, Currency.AZN));

            double eurAmount = 100;
            System.out.println("\n" + eurAmount + " EUR in USD: " + CurrencyConverter.convertToUSD(eurAmount, Currency.EUR));
        }
    }
}
