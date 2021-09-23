// The functions should have numbers as the parameters
// The functions should returns doubles because converting from Celsius to Fahrenheit requires multiplication w/ fractions

public class CtoFTester{
  public static double celsiusToFahrenheit(double celsius) {
    return (celsius * 1.8) + 32 ;
  }
  public static double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * (5 / 9) ;
  }
// main method prints both celsius and fahrenheit conversions
  public static void main(String[] args) {
    System.out.println(celsiusToFahrenheit(25.0) + " " + fahrenheitToCelsius(76.0)) ;
  }
}
