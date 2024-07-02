package exercicio09;

/**
 * 9. Crie uma interface CurrencyConverter com um método
 * convert(double amount, String fromCurrency, String toCurrency).
 * Implemente esta interface em duas classes diferentes, UsdToEurConverter e EurToThbConverter,
 * que convertem valores entre diferentes moedas.
 */
public class UsdToEurConverter implements CurrencyConverter {
    private static final double RATE = 0.93;

    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        if ("USD".equals(fromCurrency) && "EUR".equals(toCurrency)) {
            return amount * RATE;
        }

        if ("EUR".equals(fromCurrency) && "USD".equals(toCurrency)) {
            return amount / RATE;
        }

        throw new IllegalArgumentException("Não foi possível converter " + fromCurrency + " para " + toCurrency);
    }
}
