
/**
 * Unit Conversion.
 *
 * @author Nico Bour 
 */
public class Convert {

    /**
     * Converts units.
     * 
     *
     * @param c a double
     * @return number a double
     */
    
    public static double fromCelsiusToFahrenheit(double c) {
        double f;
        f = (9.0 / 5.0 * c) + 32.0;
        return f;
    }
    /**
     * Converts units.
     * 
     *
     * @param f a double
     * @return number a double
     */
    
    public static double fromFahrenheitToCelsius(double f) {
        double c;
        c = (5.0 / 9.0) * (f - 32.0);        
        return c;
    }
    /**
     * Converts units.
     * 
     *
     * @param k a double
     * @return number a double
     */
    
    public static double fromKilometersToMiles(double k) {
        double m;
        m = k / 1.60934;
        return m;
    }
    /**
     * Converts units.
     * 
     *
     * @param m a double
     * @return number a double
     */
    
    public static double fromMilesToKilometers(double m) {
        double k;
        k = m * 1.60934;
        return k;
    }
    /**
     * Converts units.
     * 
     *
     * @param meps a double
     * @return number a double
     */
    
    public static double fromMetersPerSecondToMilesPerHour(double meps) {
        double miph;
        miph = meps * 2.2369;
        return miph;
    }
    /**
     * Converts units.
     * 
     *
     * @param miph a double
     * @return number a double
     */
    
    public static double fromMilesPerHourToMetersPerSecond(double miph) {
        double meps;
        meps = miph / 2.2369;
        return meps;
    }
    
}
