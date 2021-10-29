
public class SwapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

}
