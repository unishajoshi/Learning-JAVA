import java.util.Scanner;

public class DinnerMenu {
	static double total_dinner_bill;
	int biryani_bill = BiryaniMenu.total_biryani_bill;
	int drinks_bill  = SubDrinksMenu.total_drinks_bill;
	int icecream_bill = IceCreamMenu.total_icecream_bill;
	
	Scanner sc= new Scanner(System.in);

	void bill() {
		
		if (biryani_bill > 0)
			System.out.println("Your Total biryani bill:" + biryani_bill);
		if (drinks_bill > 0)
			System.out.println("Your Total drinks bill:" + drinks_bill);
		if (icecream_bill > 0)
			System.out.println("Your Total icecream bill:" + icecream_bill);
		
		total_dinner_bill = total_dinner_bill + biryani_bill + drinks_bill + icecream_bill;
		double tax = total_dinner_bill * 0.13;
		System.out.println("Your Total order bill:" + total_dinner_bill);
		System.out.println("Do you want to order more?(YES/NO)");
		String order = sc.next();
		if (order.toUpperCase().equals("NO")) {
			System.out.println("Do you want to add any tips amount?");
			System.out.println("Please enter the tips amount as 0 for $0,5 for $5 or above");
			double tips = sc.nextDouble();
			total_dinner_bill = total_dinner_bill + tax + tips;
			System.out.println("*******************************************");
			System.out.println("Your Total order  	:" + total_dinner_bill);
			System.out.println("13% Additional tax	:" + tax);
			System.out.println("Your Tips amount	:" + tips);
			System.out.println("*******************************************");
			System.out.println("Your Total Bill         :" + total_dinner_bill);
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
			System.out.println("	Here is our Dinner menu of the day	  ");
			System.out.println("*******************************************");
			// System.out.println();
			System.out.println("		1. Biryani				  ");
			System.out.println("		2. Drinks				  ");
			System.out.println("		3. IceCreams				  ");
			System.out.println("		4. Bill				  ");
			System.out.println("		5. Exit				  ");
			System.out.println("*******************************************");
			System.out.println("What would you like to order");
			DinnerMenu lm = new DinnerMenu();
			int choice = lm.sc.nextInt();
			switch (choice) {
			case 1:
				BiryaniMenu bm= new BiryaniMenu();
				bm.biryaniMenu();
				break;
			case 2:
				DrinksMenu dm = new DrinksMenu();
				dm.drinksMenu();
				break;
			case 3:
				IceCreamMenu icm= new IceCreamMenu();
				icm.iceCreamMenu();
				break;
			case 4:
				lm.bill();
				break;
			case 5:
				lm.exit();
			default:
				System.out.println("Please try again using valid option numbers between 1 to 5");

	}

}
	}
}
