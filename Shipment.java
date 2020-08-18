/**
 * Programmer: Jasleen Kaur <BR>
 * Program: Shipment.java<BR>
 * Date: 31 May 2015<BR>
 * @version 1.0 * @author jasleen Kaur
 */

public class Shipment 
{

	/**Declaring instance variable for shipment ID. **/
	private int shipmentID; 
	/**Declaring instance variable for weight. **/
	private double weight;  
	/**Declaring instance variable for method. **/
	private String method; 
	/**Declaring instance variable for cost. **/
	private double cost; 
	/**
	 * This is a constructor with id as argument
	 * @param id entered by the user
	 */
	public Shipment(int id)
	{
		shipmentID = id;
	}

	/**
	 * This method set the weight of the shipment
	 * @param weight weight of the shipment item
	 * @throws Exception If Weight is not between 0 and 100 kilos
	 */
	public void setWeight(double weight) throws Exception {

		if (weight > 0 && weight < 100) // condition to check weight is between 0 and 100 kilos.
		{
			this.weight = weight;
		} else {

			throw new Exception("Weight is not between 0 and 100 kilos");
		}

	}

	/**
	 * This is a set method which set the method of shipment.
	 * @param method the mode of shipment enteres by the user
	 * @throws Exception if that mode is not available
	 */
	public void setMethod(String method) throws Exception // set method with exception.
	{

		if (method.equalsIgnoreCase("Air") || method.equalsIgnoreCase("Truck") || method.equalsIgnoreCase("Mail")) 
		{																										 

			this.method = method;
		}
		else {
			throw new Exception("Invalid Method Requested");
		}

	}

	/**
	 * This is get method which is used to return the value of cost.
	 * @return totalCost obtained by product of weight and cost in calculateCost() method.
	 */
	public double getCost()    
	{
		double totalCost = calculateCost();// calling calculateCost() private method.
		return totalCost;// returning value of totalCost

	}

	/**
	 * This method is used to calculate the cost of shipment.
	 * @return costthe value of cost.
	 */
	private double calculateCost() {
		double cost = 0; // initializing cost to 0.

		if (method.equalsIgnoreCase("Air")) // if mode of shipment is air.
		{

			if (weight <= 10) // weight between 1 to 10
			{
				cost = 4;
			} else if (weight <= 20)// weight between 11 to 20
			{
				cost = 3;
			} else // weight over 20.
			{
				cost = 2.50;
			}

		}

		if (method.equalsIgnoreCase("Truck")) // if mode of shipment is truck.
		{

			if (weight <= 10) // weight between 1 to 10
			{
				cost = 3;
			} else if (weight <= 20)// weight between 11 to 20
			{
				cost = 2.45;
			} else // weight over 20.
			{
				cost = 1.95;
			}

		}

		if (method.equalsIgnoreCase("Mail")) // if mode of shipment is mail.
		{

			if (weight <= 10)// weight between 1 to 10
			{
				cost = 2;
			} else if (weight <= 20) // weight between 11 to 20
			{
				cost = 1.75;
			} else// weight over 20.
			{
				cost = 1.55;
			}

		}

		return cost * weight; // to calculate cost, depends on the mode of shipment and weight.
	}

	/**
	 * This get method is used to return the value of shipment ID.
	 * @return shipmentID value of shipment ID entered by user
	 */
	public int getShipmentID() // get method
	{
		return shipmentID;
	}

	/**
	 * This get method is used to return the value shipment method.
	 * @return method mode of shipment entered by user.
	 */
	public String getShipmentMethod() // get method
	{
		return method;
	}

	/**
	 * This is a method which returns the value of weight.
	 * @return weight entered by user.
	 */
	public double getShipmentWeight() // get method
	{
		return weight;
	}

}
