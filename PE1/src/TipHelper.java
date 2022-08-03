/* Name: Jiacheng Zhang
 * I actually don't like to tip too much...
 */

public class TipHelper 
{

	public static void main(String[] args) 
	{
		double tipPercentage = 0.15f;
		double mealTotal = 20.17f;
		int numberItemsOrdered = 3;
		String customerName = "Jacob";
		double totalTip = tipPercentage * mealTotal;
		double totalAmountPaid = totalTip + mealTotal;
		System.out.printf("The total tip was $%.2f!\n", totalTip);
		System.out.printf(customerName + " owes a total of $%.2f.\n", totalAmountPaid);
	}

}
