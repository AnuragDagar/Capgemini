public class Question6 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        double fahrenheit = 98.6; 
        double celsius = 37;     
        double pounds = 150;      
        double kilograms = 68;   
        double gallons = 5;       
        double liters = 20;       
        
        double resultFahrenheitToCelsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + "°F is equal to " + resultFahrenheitToCelsius + "°C.");

        double resultCelsiusToFahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C is equal to " + resultCelsiusToFahrenheit + "°F.");

        double resultPoundsToKilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds is equal to " + resultPoundsToKilograms + " kilograms.");

        double resultKilogramsToPounds = convertKilogramsToPounds(kilograms);
        System.out.println(kilograms + " kilograms is equal to " + resultKilogramsToPounds + " pounds.");

        double resultGallonsToLiters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons is equal to " + resultGallonsToLiters + " liters.");

        double resultLitersToGallons = convertLitersToGallons(liters);
        System.out.println(liters + " liters is equal to " + resultLitersToGallons + " gallons.");
    }
}
