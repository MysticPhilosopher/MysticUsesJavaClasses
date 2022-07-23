import java.util.*; 
public class TemperatureMain 
{
    public static void main(String[]args) throws Exception
    {
        
        /*
         * 1) Ask the user for a temperature in Fahrenheit
         * 2) Create an instance of the Temperature class
         * 3) Call the objects methods to complete the conversions made in the Temperature class. 
         * 
        */
        System.out.println("Enter a temperature in Fahrenheit:");
        try(Scanner temperatureInput = new Scanner(System.in)) 
        {
            double input;
            input = temperatureInput.nextDouble();
            Temperature box = new Temperature();
            box.setFahrenheit(input);
            

            System.out.println("Here are the following temperatures \n" + "Fahrenheit: " + box.getFahrenheit() 
            + "\n" + "Celsius: " + box.getCelsius() + "\n" + "Kelvin: " + box.getKelvin());

        }
        
    }    
}
