
public class SwapDemoNoTemp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
