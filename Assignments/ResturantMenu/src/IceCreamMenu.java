import java.util.Scanner;

public class IceCreamMenu {	
	Scanner sc = new Scanner(System.in);
	int btrsch_price= 10;
	int vanilla_price = 8;
	static int btrsch_bill, vanilla_bill;
	static int total_icecream_bill;

	void btrsch() {
		System.out.println("How many scoops of Butterscotch you want?");
		int qty = sc.nextInt();

		btrsch_bill = btrsch_bill+ btrsch_price* qty;
		System.out.println("Your total Butterscotch bill is:" + btrsch_bill);
		System.out.println();
		total_icecream_bill = total_icecream_bill + btrsch_bill;
	}

	void venilla() {

		System.out.println("How many scoops of venilla you want?");
		int qty = sc.nextInt();
		vanilla_bill = vanilla_bill + vanilla_price * qty;
		System.out.println("Your total venilla bill is:" + vanilla_bill);
		System.out.println();
		total_icecream_bill = total_icecream_bill + vanilla_bill;
	}

	void iceCreamMenu() {
		// TODO Auto-generated method stub
			System.out.println("*******************************************");
			System.out.println("	Here are the IceCream options ");
			System.out.println("*******************************************");
			// System.out.println();
			System.out.println("		1. Butterscotch 			  ");
			System.out.println("		2. Venilla 						");
			System.out.println("		3. Back	to main menu			  ");
			System.out.println("*******************************************");
			System.out.println("What would you like to order");
			IceCreamMenu icm = new IceCreamMenu();
			int choice = icm.sc.nextInt();
			switch (choice) {
			case 1:
				btrsch();
				iceCreamMenu();
				break;
			case 2:
				venilla();
				iceCreamMenu();
				break;
			case 3:
				DinnerMenu.main(null);
				break;
			default:
				System.out.println("Please try again using valid option numbers between 1 to 3");

			
	}

}
}
