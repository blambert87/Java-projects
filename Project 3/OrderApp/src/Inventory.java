import java.util.*;

public class Inventory
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);

		//array list
		ArrayList<Item> items = new ArrayList<Item>();

		items.add(new Item(1, "hammer", 5, 12));
		items.add(new Item(2, "circular saw", 3, 100));
		items.add(new Item(3, "nail gun", 4, 75));
		items.add(new Item(4, "measuring tape", 3, 20));
		items.add(new Item(5, "chalk line", 2, 10));

		char repeat;
		do
		{
			int selection;
			do
			{
				//display menu for user
				System.out.println("press 1 to order a hammer");
				System.out.println("press 2 to order a circular saw");
				System.out.println("press 3 to order a nail gun");
				System.out.println("press 4 to order a measuring tape");
				System.out.println("press 5 to order a chalk line");
				selection = console.nextInt();
				if(selection > 5 || selection < 1)
						System.out.println("Invalid number");
			}while(selection > 5 || selection < 1);


			Item orderedItem = items.get(selection - 1);

			int quantity;
			do
			{
				System.out.println("please enter quantity");
				quantity = console.nextInt();

				//testing to see if quantity is available
				if (quantity > orderedItem.getQuantityInStore())
					System.out.println("Not enough in stock");
			}while(quantity > orderedItem.getQuantityInStore());

			//price method
			double orderPrice = quantity * orderedItem.getPrice();

			System.out.println("total is: " + orderPrice);

			console.nextLine();


			System.out.println("Do you want to order another item?/n" +
				"press y for yes and n for no");
			repeat = console.nextLine().charAt(0);

		}while(repeat == 'y');



	}
}