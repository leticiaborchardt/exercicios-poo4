package exercicio09;

/**
 * 9. Crie uma interface CurrencyConverter com um método
 * convert(double amount, String fromCurrency, String toCurrency).
 * Implemente esta interface em duas classes diferentes, UsdToEurConverter e EurToThbConverter,
 * que convertem valores entre diferentes moedas.
 */
public class EurToThbConverter implements CurrencyConverter {
    private static final double RATE = 39.55;

    @Override
    public double convert(double amount, String fromCurrency, String toCurrency) {
        if ("EUR".equals(fromCurrency) && "THB".equals(toCurrency)) {
            return amount * RATE;
        }

        if ("THB".equals(fromCurrency) && "EUR".equals(toCurrency)) {
            return amount / RATE;
        }

        throw new IllegalArgumentException("Não foi possível converter " + fromCurrency + " para " + toCurrency);
    }
}
