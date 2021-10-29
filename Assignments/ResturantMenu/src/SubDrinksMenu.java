import java.util.Scanner;

public class SubDrinksMenu {
	Scanner sc = new Scanner(System.in);
	int sprite_price = 7;
	int thumpsup_price = 8;
	int tea_price = 10;
	int coffee_price = 12;
	static int sprite_bill, thumpsup_bill, tea_bill, coffee_bill;
	static int total_drinks_bill;

	void spriteDrink() {
		System.out.println("How many glasses of Sprite do you want?");
		int qty = sc.nextInt();
		sprite_bill = sprite_bill + sprite_price * qty;
		System.out.println("Your total Sprite bill is:" + sprite_bill);
		System.out.println();
		total_drinks_bill = total_drinks_bill + sprite_bill;
	}

	void thumpsupDrink() {

		System.out.println("How many glasses of Thumpsup do you want?");
		int qty = sc.nextInt();
		thumpsup_bill = thumpsup_bill + thumpsup_price * qty;
		System.out.println("Your total thumpsup bill is:" + thumpsup_bill);
		System.out.println();
		total_drinks_bill = total_drinks_bill + thumpsup_bill;
	}

	void teaDrink() {

		System.out.println("How many cups of Tea do you want?");
		int qty = sc.nextInt();
		tea_bill = tea_bill + tea_price * qty;
		System.out.println("Your total tea bill is:" + tea_bill);
		System.out.println();
		total_drinks_bill = total_drinks_bill + tea_bill;
	}

	void coffeeDrink() {

		System.out.println("How many cups of Coffee do you want?");
		int qty = sc.nextInt();
		coffee_bill = coffee_bill + coffee_price * qty;
		System.out.println("Your total Coffee bill is:" + coffee_bill);
		System.out.println();
		total_drinks_bill = total_drinks_bill + coffee_bill;

	}

	void softDrinksMenu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("*******************************************");
			System.out.println("	Here are the SoftDrinks options ");
			System.out.println("*******************************************");
			// System.out.println();
			System.out.println("		1. Sprite");
			System.out.println("		2. ThumpsUp");
			System.out.println("		3. Back to drinks main menu");
			System.out.println("*******************************************");
			System.out.println("What would you like to order");
			SubDrinksMenu sdm = new SubDrinksMenu();
			int choice = sdm.sc.nextInt();
			switch (choice) {
			case 1:
				spriteDrink();
				softDrinksMenu();
				break;
			case 2:
				thumpsupDrink();
				softDrinksMenu();
				break;
			case 3:
				DrinksMenu dm = new DrinksMenu();
				dm.drinksMenu();
				break;
			default:
				System.out.println("Please try again using valid option numbers between 1 to 3");

			}
		}

	}

	void hotDrinksMenu() {
		// TODO Auto-generated method stub
		System.out.println("*******************************************");
		System.out.println("	Here are the HotDrinks options ");
		System.out.println("*******************************************");
		// System.out.println();
		System.out.println("		1. Coffee");
		System.out.println("		2. Tea");
		System.out.println("		3. Back to drinks main menu");
		System.out.println("*******************************************");
		System.out.println("What would you like to order");
		SubDrinksMenu sdm = new SubDrinksMenu();
		int choice = sdm.sc.nextInt();
		switch (choice) {
		case 1:
			coffeeDrink();
			hotDrinksMenu();
			break;
		case 2:
			teaDrink();
			hotDrinksMenu();
			break;
		case 3:
			DrinksMenu dm = new DrinksMenu();
			dm.drinksMenu();
			break;
		default:
			System.out.println("Please try again using valid option numbers between 1 to 3");

		}
	}

}
