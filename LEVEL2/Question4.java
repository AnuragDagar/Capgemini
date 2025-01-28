public class Question4 {

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        double km = 10; 
        double miles = 6.2;
        double meters = 5; 
        double feet = 16.4;
        
        double resultKmToMiles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + resultKmToMiles + " miles.");

        double resultMilesToKm = convertMilesToKm(miles);
        System.out.println(miles + " miles is equal to " + resultMilesToKm + " kilometers.");

        double resultMetersToFeet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + resultMetersToFeet + " feet.");

        double resultFeetToMeters = convertFeetToMeters(feet);
        System.out.println(feet + " feet is equal to " + resultFeetToMeters + " meters.");
    }
}
