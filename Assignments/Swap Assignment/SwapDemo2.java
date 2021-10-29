
public class SwapDemo2 {

	static void swapTemp() {
		// For swapping two numbers without using temporary variable
		System.out.println("\nSwapping two numbers using temporary variable");
		int fno = 100;
		int sno = 200;
		System.out.println("Before Swapping");
		System.out.println("Fno:\t" + fno + "\tSno:\t" + sno);
		int temp;
		temp = fno;
		fno = sno;
		sno = temp;
		System.out.println("After Swapping");
		System.out.println("Fno:\t" + fno + "\tSno:\t" + sno);

		// For swapping three numbers using temporary variable
		System.out.println("\nSwapping three numbers using temporary variable");
		int no1 = 100;
		int no2 = 200;
		int no3 = 300;
		System.out.println("Before Swapping");
		System.out.println("no1:\t" + no1 + "\t no2:\t" + no2 + "\tno3:\t" + no3);
		temp = no1;
		no1 = no2;
		no2 = no3;
		no3 = temp;
		System.out.println("After Swapping");
		System.out.println("no1:\t" + no1 + "\t no2:\t" + no2 + "\tno3:\t" + no3);

		// For swapping Four numbers using temporary variable
		System.out.println("\nSwapping four numbers using temporary variable");
		no1 = 100;
		no2 = 200;
		no3 = 300;
		int no4 = 400;
		System.out.println("Before Swapping");
		System.out.println("no1:\t" + no1 + "\t no2:\t" + no2 + "\tno3:\t" + no3 + "\tno4:\t" + no4);
		temp = no1;
		no1 = no2;
		no2 = no3;
		no3 = no4;
		no4 = temp;
		System.out.println("After Swapping");
		System.out.println("no1:\t" + no1 + "\t no2:\t" + no2 + "\tno3:\t" + no3 + "\tno4:\t" + no4);
	}

	void swapNonTemp() {

		// For swapping two numbers without using temporary variable
		System.out.println("\nSwapping two numbers using temporary variable");
		int fno = 100;
		int sno = 200;
		System.out.println("Before Swapping");
		System.out.println("Fno:  " + fno + " Sno:  " + sno);
		fno = fno + sno;
		sno = fno - sno;
		fno = fno - sno;
		System.out.println("After Swapping");
		System.out.println("Fno:  " + fno + "  Sno:  " + sno);

		// For swapping three numbers without using temporary variable
		System.out.println("\nSwapping three numbers using temporary variable");
		int no1 = 100;
		int no2 = 200;
		int no3 = 300;
		System.out.println("Before Swapping");
		System.out.println("no1:\t" + no1 + "\t no2:\t" + no2 + "\tno3:\t" + no3);
		no1 = no1 + no2 + no3;
		no2 = no1 - no2 - no3;
		no3 = no1 - no2 - no3;
		no1 = no1 - no2 - no3;
		System.out.println("After Swapping");
		System.out.println("no1:\t" + no1 + "\t no2:\t" + no2 + "\tno3:\t" + no3);

		// For swapping four numbers without using temporary variable
		System.out.println("\nSwapping four numbers using temporary variable");
		no1 = 100;
		no2 = 200;
		no3 = 300;
		int no4 = 400;
		System.out.println("Before Swapping");
		System.out.println("no1:\t" + no1 + "\t no2:\t" + no2 + "\tno3:\t" + no3 + "\tno4:\t" + no4);
		no1 = no1 + no2 + no3 + no4;
		no2 = no1 - no2 - no3 - no4;
		no3 = no1 - no2 - no3 - no4;
		no4 = no1 - no2 - no3 - no4;
		no1 = no1 - no2 - no3 - no4;
		System.out.println("After Swapping");
		System.out.println("no1:\t" + no1 + "\t no2:\t" + no2 + "\tno3:\t" + no3 + "\tno4:\t" + no4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Always try to create a module for the task and call it from the main module

		swapTemp();

		// If the module is static we can call directly but if the module is nonstatic
		// then we need to create object to call the module

		// swapNonTemo(); // this generates the error

		SwapDemo2 dmo1 = new SwapDemo2();
		dmo1.swapNonTemp();
	}

}
