import java.util.Scanner;

public class LunchMenu {
	Scanner sc = new Scanner(System.in);
	double total_lunch_bill;
	int dosa_price = 30;
	int idly_price = 28;
	int upma_price = 21;
	int puri_price = 24;
	static int dosa_bill, idly_bill, upma_bill, puri_bill;

	void dosa() {
		System.out.println("How many plates of dosa you want?");
		int qty = sc.nextInt();
		dosa_bill = dosa_bill + dosa_price * qty;
		System.out.println("Your total dosa bill is:" + dosa_bill);
		System.out.println();
	}

	void idly() {

		System.out.println("How many plates of idly you want?");
		int qty = sc.nextInt();
		idly_bill = idly_bill + idly_price * qty;
		System.out.println("Your total idly bill is:" + idly_bill);
		System.out.println();
	}

	void upma() {

		System.out.println("How many plates of upma you want?");
		int qty = sc.nextInt();
		upma_bill = upma_bill + upma_price * qty;
		System.out.println("Your total upma bill is:" + upma_bill);
		System.out.println();
	}

	void puri() {

		System.out.println("How many plates of puri you want?");
		int qty = sc.nextInt();
		puri_bill = puri_bill + puri_price * qty;
		System.out.println("Your total puri bill is:" + puri_bill);
		System.out.println();

	}

	void bill() {
		if (dosa_bill > 0)
			System.out.println("Your Total dosa bill:" + dosa_bill);
		if (idly_bill > 0)
			System.out.println("Your Total idly bill:" + idly_bill);
		if (upma_bill > 0)
			System.out.println("Your Total upma bill:" + upma_bill);
		if (puri_bill > 0)
			System.out.println("Your Total puri bill:" + puri_bill);
		total_lunch_bill = total_lunch_bill + dosa_bill + idly_bill + upma_bill + puri_bill;
		double tax = total_lunch_bill * 0.13;
		System.out.println("Your Total order bill:" + total_lunch_bill);
		System.out.println("Do you want to order more?(YES/NO)");
		String order = sc.next();
		if (order.toUpperCase().equals("NO")) {
			System.out.println("Do you want to add any tips amount?");
			System.out.println("Please enter the tips amount as 0 for $0,5 for $5 or above");
			double tips = sc.nextDouble();
			total_lunch_bill = total_lunch_bill + tax + tips;
			System.out.println("*******************************************");
			System.out.println("Your Total order  	:" + total_lunch_bill);
			System.out.println("13% Additional tax	:" + tax);
			System.out.println("Your Tips amoutn	:" + tips);
			System.out.println("Your Total Bill     :" + total_lunch_bill);
			System.out.println("*******************************************");
			exit();
		}
	}

	void exit() {
		System.out.println("*****Thank You for using our app*******");
		System.out.println("*******************************************");
		System.exit(0);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******************************************");
		System.out.println("	Welcome to our Online Resturant	  ");
		while (true) {
			System.out.println("*******************************************");
			System.out.println("	Here is our menu of the day	  ");
			System.out.println("*******************************************");
			// System.out.println();
			System.out.println("		1. Dosa				  ");
			System.out.println("		2. Idly				  ");
			System.out.println("		3. Upma				  ");
			System.out.println("		4. Puri				  ");
			System.out.println("		5. Bill				  ");
			System.out.println("     Go to Bill if you want to EXIT");
			System.out.println("*******************************************");
			System.out.println("What would you like to order");
			LunchMenu lm = new LunchMenu();
			int choice = lm.sc.nextInt();
			switch (choice) {
			case 1:
				lm.dosa();
				break;
			case 2:
				lm.idly();
				break;
			case 3:
				lm.upma();
				break;
			case 4:
				lm.puri();
				break;
			case 5:
				lm.bill();
				break;
			default:
				System.out.println("Please try again using valid option numbers between 1 to 5");

			}

		}

	}

}
