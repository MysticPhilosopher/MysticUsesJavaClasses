/*
 * __Planning__
 * 1) Create the following field and store it as a double: --> ftemp;
 * 2) Make a constructor that accepts a Fahrenheit temperature (data type: double) and stores in the ftemp
 *    field.
 * 3) Making the following methods:
 *      a- setFahrenheit()
 *          -Will accept Fahrenheit as a double and store within the temp field.
 *      b- getFahrenheit()
 *          -Will return the value of the temp field, as a Fahrenheit temperature (no conversion needed)
 *      c- getCelsius()
 *          returns the conversion from ftemp to celsius
 *          Formula: Celsius = (5/9) * (Fahrenheit-32)
 *      d- getKelvin()
 *          returns the conversion of ftemp field to kelvin
 *          Formula: ((5/9) * (Fahrenheit-32)) + 273
 * 
 */
public class Temperature
{
    private double ftemp;

    public void setFahrenheit(double fahrenheit)
    {
        ftemp = fahrenheit;
    }
    public double getFahrenheit()
    {
        return ftemp;
    }
    public double getCelsius()
    {
        return (ftemp - 32) * 5/9;
    }
    public double getKelvin()
    {
        return (ftemp - 32) * 5/9 + 273.15; 
    }

}