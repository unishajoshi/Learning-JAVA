import java.util.Scanner;

public class DrinksMenu {
	Scanner sc = new Scanner(System.in);

	void drinksMenu() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("*******************************************");
			System.out.println("	Here are the Drinks options ");
			System.out.println("*******************************************");
			// System.out.println();
			System.out.println("		1. Soft Drinks		  ");
			System.out.println("		2. Hot Drinks				  ");
			System.out.println("		3. Back	to main menu			  ");
			System.out.println("*******************************************");
			System.out.println("What would you like to order");
			DrinksMenu dm = new DrinksMenu();
			SubDrinksMenu sdm = new SubDrinksMenu();
			int choice = dm.sc.nextInt();
			switch (choice) {
			case 1:
				sdm.softDrinksMenu();
				drinksMenu();
				break;
			case 2:
				sdm.hotDrinksMenu();
				drinksMenu();
				break;
			case 3:
				DinnerMenu.main(null);
				break;
			default:
				System.out.println("Please try again using valid option numbers between 1 to 3");

			}
		}

	}
}
