/**
 * Programmer: Jasleen Kaur <BR>
 * Program:    Customer.java<BR>
 * Date:       31 May 2015<BR>
 * @version 1.0 * @author jasleen Kaur
 */

import java.util.Arrays;  

public class Customer
{

	private int[] customerIDs = { 101, 103, 106, 109 };  // private array for customer IDs
	private String[] customerNames = { "Fredd Budd", "Joe Strummer", "Wilma Flint", "James Bond" };//private array for customer Names
	/** declaring instance variable for customerID**/
	private int customerID;  
	/** declaring instance variable for name**/
	private String name;  

	/**
	 * This method is used to set the customer ID.
	 * @param id entered by the user in command-line.
	 * @throws Exception if the id entered in command-line is not present in customerIDs array.
	 */
	public void setCustomerID(int id) throws Exception
	{

		int customerIDindex = Arrays.binarySearch(customerIDs, id);// using binary search to search the id entered by the user in customerIDs array.

		if (customerIDindex < 0) { // if id not present it will return a negative value.
			throw new Exception("The customer ID is provided is not valid");
		}
		customerID = id;

		setName(customerNames[customerIDindex]);// setting name of the customer with help of set method.

	}
	/**
	 * This method is used to get the name of the customer
	 * @return name customer name with the help of customer ID value entered in command-line.
	 */
	public String getName() 
	{

		return name;

	}
	/**
	 * This method is used to set the anem of the customer
	 * @param customerName the name of the customer
	 */
	private void setName(String customerName) 
	{

		//assigning the local variable value
		name = customerName;
	}

}
