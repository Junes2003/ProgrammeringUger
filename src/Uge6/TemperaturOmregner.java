package Uge6;
public class TemperaturOmregner {

    // Det her er metoden til at kunne omregne Fahrenheit til Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        // Sådan skal beregningen af Celsius ud fra Fahrenheit se ud.
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    // Det her er metoden til at kunne omregne celsius til fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        // SÅdan skal beregningen af Fahrenheit ud fra Celsius se ud.
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        // SÅdan her tester jeg den her fahrenheitToCelsius-metoden
        double fahrenheit = 98.6;
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " grader Fahrenheit er " + celsius + " grader Celsius.");

        // Sådan her tester jeg den her celsiusToFahrenheit-metode
        double celsiusValue = 37.0;
        double fahrenheitValue = celsiusToFahrenheit(celsiusValue);
        System.out.println(celsiusValue + " grader Celsius er " + fahrenheitValue + " grader Fahrenheit.");
    }
}