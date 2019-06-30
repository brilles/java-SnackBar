package snackbarApp;

public class Main 
{
	private static void workWithData()
	{
		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bob", 33.14);

		Vendingmachine vm1 = new Vendingmachine("Food"); // id=1
		Vendingmachine vm2 = new Vendingmachine("Drink"); // id=2
		Vendingmachine vm3 = new Vendingmachine("Office"); // id=2

		Snack s1 = new Snack("Chips", 36, 1.75, 1);
		Snack s2 = new Snack("Chocolate Bar", 36, 1.00, 1);
		Snack s3 = new Snack("Pretzel", 30, 2.00, 1);
		Snack s4 = new Snack("Soda", 24, 2.50, 2);
		Snack s5 = new Snack("Water", 20, 2.75, 2);

		// 1. Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
		System.out.println("#1");
		c1.buyTotal(s4, 3);
		System.out.println(c1.getCash());
		System.out.println(s4.getQuantity());

		// 2. Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
		System.out.println("#2");
		c1.buyTotal(s3, 1);
		System.out.println(c1.getCash());
		System.out.println(s3.getQuantity());

		// 3. Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
		System.out.println("#3");
		c2.buyTotal(s4, 2);
		System.out.println(c2.getCash());
		System.out.println(s4.getQuantity());

		// 4. Customer 1 finds $10. Print Customer 1 Cash on Hand.
		System.out.println("#4");
		c1.addCash(10);
		System.out.println(c1.getCash());

		// 5. Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
		System.out.println("#5");
		c1.buyTotal(s2, 2);
		System.out.println(c2.getCash());
		System.out.println(s2.getQuantity());

		// 6. Add 12 more items to snack 3. Print quantity of snack 3.
		System.out.println("#6");
		s3.addQuantity(12);
		System.out.println(s3.getQuantity());

		// 7. Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
		System.out.println("#7");
		c2.buyTotal(s3, 3);
		System.out.println(c2.getCash());
		System.out.println(s3.getQuantity());
	}

	public static void main(String[] args)
	{
		workWithData();
	}
}