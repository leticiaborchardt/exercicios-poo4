package exercicio02;

/**
 * 2. Crie uma classe TemperatureConverter com um método estático celsiusToFahrenheit
 * que converte uma temperatura de Celsius para Fahrenheit e um método fahrenheitToCelsius
 * que converte de Fahrenheit para Celsius.
 */
public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celcius) {
        return (celcius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahreinheit) {
        return (fahreinheit - 32) * 5/9;
    }
}
