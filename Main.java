/**
 * Programmer: Jasleen Kaur <BR>
 * Program:    Main.java<BR>
 * Date:       31 May 2015<BR>
 * @version 1.0 * @author jasleen Kaur
 */

import java.text.DecimalFormat;   
import java.util.Scanner;  

public class Main
{
	/** declaring instance variable for customerID **/
	static int customerID;   
	/** declaring instance variable for numShipment **/
	static int numShipment;    


	/**
	 * This is the main method which throws exception if the user do not enter two arguments.
	 * @param args to pass arguments for customerID and customerName.
	 * @throws Exception if argument is not a number or 2 arguments are not provided
	 */
	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);  
		DecimalFormat df = new DecimalFormat("0.00");// for decimal formatting

		if (args.length != 2) //condition to check whether user has input two arguments.
		{
			throw new Exception("Please provide two arguments in the command line");
		}

		// checking if the arguments are numbers
		try {
			customerID = Integer.parseInt(args[0]); 
			numShipment = Integer.parseInt(args[1]);
		} catch (NumberFormatException ex) {
			throw new NumberFormatException("Error: The argument should be numbers");
		}

		Customer customer = new Customer(); //creating Customer object

		customer.setCustomerID(customerID);//setting customer ID by calling the method from Customer class.

		Shipment[] shipments = new Shipment[numShipment];// creating shipments array.


		// Prompting user for shipment information and calling the Shipment class setters
		for (int i = 0; i < numShipment; i++)
		{
			System.out.println("\n____________________________");
			System.out.println("Enter the Shipment ID: ");
			shipments[i] = new Shipment(scan.nextInt());

			System.out.println("Enter the Shipment method: ");
			shipments[i].setMethod(scan.next());

			System.out.println("Enter the Shipment weight: ");
			shipments[i].setWeight(scan.nextDouble());

		}

		System.out.println("Customer ID: " + customerID + ". Customer Name: " + customer.getName() + "\n");// printing the value of customer ID and customer Name from the input in command-line. 

		for (Shipment shipment : shipments)//for each loop to print all the shipment data.
		{
			System.out.println("\nShipment ID: " + shipment.getShipmentID() + "\nShipment Method: "
					+ shipment.getShipmentMethod() + "\nShipment Weight: " + df.format(shipment.getShipmentWeight())
					+ "\nShipment Cost: $" + df.format(shipment.getCost()));
			System.out.println("\n--------------------------------------\n");

		}
		System.out.println("Student Name: Jasleen Kaur \n Student number:991587295");

	}

}
