package junitIntroduction;


/**
 * This class is used to convert temperatures between celsius and fahrenheit
 * @author Luca Tomescu
 * @version 1.1
 */
public class TemperatureConverter {

    /**
     * This method converts from Celsius to Fahrenheit
     * @param celsius is the celsius temperature we want to convert
     * @return the corresponding fahrenheit temprature
     */
    public static double celsisusToFahrenheit(double celsius) {
        double fahrenheit = (9.0/5.0)*celsius + 32;
        return fahrenheit;
    }

    /**
     * This method converts from Fahrenheit to Celsius
     * @param fahrenheit is the fahrenheit temperature we want to convert
     * @return the corresponding celsius temperature
     */
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0/9.0)*(fahrenheit - 32);
        return celsius;
    }

}
