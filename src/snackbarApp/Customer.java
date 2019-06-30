package snackbarApp;

public class Customer
{
	private static int maxId = 0;
	private int id;
	private String name;
	private double cash;

	public Customer(String name, double cash)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.cash = cash;
	}

	// customer can add cash
	public void addCash(double cash)
	{
		this.cash += cash;
	}

	// customer can buy total cash used in purchase
	public String buyTotal(Snack snack, int quantity)
	{
		// we need to make sure that the customer has enough money to buy the items
		// we need to make sure the vending machine has the quanity available for that item
		int snackQuantity = snack.getQuantity();
		if (snackQuantity < quantity) 
		{
			return "There's only " + snackQuantity + " " + snack.getName() + "available.";
		}

		else 
		{
			double total = snack.getTotalCost(quantity);
			if (total > cash) 
			{
				return "Insufficient funds. " + "The total is " + total + "." + name + "only has " + cash + " dollars.";
			}

			else 
			{
				if (total <= cash)
				{
					this.cash -= total;
					snack.buySnack(quantity);
					String plural;
					if (quantity > 1)
					{
						plural = "'s";
					} 

					else 
					{
						plural = "";
					}

					return quantity + snack.getName() + plural + " bought by" + name; 				
				}
			}
		}
		return "error";
	}

	// get and set name
	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	// get cash on hand
	public double getCash()
	{
		return cash;
	}	
}