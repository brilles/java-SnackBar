package snackbarApp;

public class Snack 
{
	private static int maxId = 0;
	private int id;
	private String name;
	private int quantity;
	private double cost;
	private int vendingMachineID;

	public Snack(String name, int quantity, double cost, int vendingMachineID)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.vendingMachineID = vendingMachineID;
	}

	// set id
	public void setId(int id)
	{
		this.id = id;
	}

	// get id
	public int getId() 
	{
		return id;
	}

	// set name
	public void setName(String name) 
	{
		this.name = name;
	}

	// get name
	public String getName() 
	{
		return name;
	}

	// set cost
	public void setCost(double cost)
	{
		this.cost = cost;
	}

	// get cost
	public double getCost()
	{
		return cost;
	}

	// set vendingMachineID
	public void setVendingMachineID(int vendingMachineID)
	{
		this.vendingMachineID = vendingMachineID;
	}

	// get vendingMachineID
	public int getVendingMachineID()
	{
		return vendingMachineID;
	}

	// get quanitity
	public int getQuantity()
	{
		return quantity;
	}

	// add quantity when given how many to add
	public void addQuantity(int quantity)
	{
		this.quantity += quantity;
	}

	// buy snack
	public void buySnack(int quantity)
	{	
		this.quantity -= quantity;
	}

	// get total cost
	public double getTotalCost(int quantity)
	{
		return quantity * cost;
	}

	@Override
	public String toString()
	{
		String rtnStr = "Name: " + name + "\n" +
						"Vending Machine (id): " + vendingMachineID + "\n" +
						"Quanitity on hand: " + quantity + "\n" +
						"Total cost of all the quanitites of this snack on hand: " + getTotalCost(quantity) + "\n";
		return rtnStr;
	}
}