package snackbarApp;

public class Vendingmachine
{
	private static int maxId = 0;
	public int id;
	public String name;

	public Vendingmachine(String name)
	{
		this.id = maxId++;
		this.name = name;
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

}