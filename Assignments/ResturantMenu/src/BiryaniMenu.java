import java.util.Scanner;

public class BiryaniMenu {
	Scanner sc = new Scanner(System.in);
	int chknBriyani_price = 55;
	int mutnBiryani_price = 60;
	int eggBiryani_price = 45;
	int vegBiryani_price = 40;
	static int chknBriyani_bill, mutnBiryani_bill, eggBiryani_bill, vegBiryani_bill;
	static int total_biryani_bill;

	void chknBriyani() {
		System.out.println("How many plates of chknBriyani you want?");
		int qty = sc.nextInt();

		chknBriyani_bill = chknBriyani_bill + chknBriyani_price * qty;
		System.out.println("Your total chknBriyani bill is:" + chknBriyani_bill);
		System.out.println();
		total_biryani_bill = total_biryani_bill + chknBriyani_bill;
	}

	void mutnBiryani() {

		System.out.println("How many plates of mutnBiryani you want?");
		int qty = sc.nextInt();
		mutnBiryani_bill = mutnBiryani_bill + mutnBiryani_price * qty;
		System.out.println("Your total mutnBiryani bill is:" + mutnBiryani_bill);
		System.out.println();
		total_biryani_bill = total_biryani_bill + mutnBiryani_bill;
	}

	void eggBiryani() {

		System.out.println("How many plates of eggBiryani you want?");
		int qty = sc.nextInt();
		eggBiryani_bill = eggBiryani_bill + eggBiryani_price * qty;
		System.out.println("Your total eggBiryani bill is:" + eggBiryani_bill);
		System.out.println();
		total_biryani_bill = total_biryani_bill + eggBiryani_bill;
	}

	void vegBiryani() {

		System.out.println("How many plates of vegBiryani you want?");
		int qty = sc.nextInt();
		vegBiryani_bill = vegBiryani_bill + vegBiryani_price * qty;
		System.out.println("Your total vegBiryani bill is:" + vegBiryani_bill);
		System.out.println();
		total_biryani_bill = total_biryani_bill + vegBiryani_bill;

	}

	 void biryaniMenu() {
		// TODO Auto-generated method stub
			System.out.println("*******************************************");
			System.out.println("	Here are the Biryani options ");
			System.out.println("*******************************************");
			// System.out.println();
			System.out.println("		1. Chicken Biryani			  ");
			System.out.println("		2. Mutton Biryani				  ");
			System.out.println("		3. Egg Biryani				  ");
			System.out.println("		4. Veg Biryani				  ");
			System.out.println("		5. Back	to main menu			  ");
			System.out.println("*******************************************");
			System.out.println("What would you like to order");
			BiryaniMenu bm = new BiryaniMenu();
			int choice = bm.sc.nextInt();
			switch (choice) {
			case 1:
				bm.chknBriyani();
				biryaniMenu();
				break;
			case 2:
				bm.mutnBiryani();
				biryaniMenu();
				break;
			case 3:
				bm.eggBiryani();
				biryaniMenu();
				break;
			case 4:
				bm.vegBiryani();
				biryaniMenu();
				break;
			case 5:
				DinnerMenu.main(null);
				break;
			default:
				System.out.println("Please try again using valid option numbers between 1 to 5");

			}

}
}
