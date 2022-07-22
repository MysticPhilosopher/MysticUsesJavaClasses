import java.util.*;
public class CustomerMain
{
    public static void main(String[]args) throws Exception
    {
        String nameInput;
        String addressInput;
        String phoneNumberInput;
        /*
         * __Planning__
         * 
         * 1) Ask the user to input his/her name.
         *      a- Take the input and pass the object as an argument.
         * 2) Ask the user for their address
         *      a- Take the input of the address and store through the box method. 
         * 3) Take the input of the Phone Number and continue 
         */

         System.out.println("Enter your name: ");
         try (Scanner input = new Scanner(System.in)) 
         {
            nameInput = input.nextLine();
             Customer box= new Customer();


             System.out.println("Enter in your address: ");
             addressInput = input.nextLine();

             System.out.println("Enter in your phone number: ");
             phoneNumberInput = input.nextLine();

            //Storing the data from the inputs from the Customer class methods to the main method.
             box.setName(nameInput);
             box.setAddress(addressInput);
             box.setPhone(phoneNumberInput);
            
             //Printing the after results from the inputs.
             System.out.println("Name is " + box.getName());
             System.out.println("Address: " + box.getAddress());
             System.out.println("Phone type: " + box.getPhone());
        }


         
    }
}