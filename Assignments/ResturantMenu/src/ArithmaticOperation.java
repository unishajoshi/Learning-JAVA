import java.util.Scanner;

public class ArithmaticOperation {
	Scanner sc = new Scanner(System.in);
	int fno;
	int sno;
	int result;

	void add() {
		System.out.println("Enter First Number :");
		fno = sc.nextInt();
		System.out.println("Enter Second Number :");
		sno = sc.nextInt();
		result = fno + sno;
		System.out.println("Addition of Two Numbers : " + result);
	}

	void sub() {
		System.out.println("Enter First Number :");
		fno = sc.nextInt();
		System.out.println("Enter Second Number :");
		sno = sc.nextInt();
		result = fno - sno;
		System.out.println("Subtraction of Two Numbers : " + result);
	}

	void mul() {
		System.out.println("Enter First Number :");
		fno = sc.nextInt();
		System.out.println("Enter Second Number :");
		sno = sc.nextInt();
		result = fno * sno;
		System.out.println("Multiplication of Two Numbers : " + result);
	}

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArithmaticOperation demo = new ArithmaticOperation();
		while (true) {
			System.out.println("*****************************");
			System.out.println(" 1)ADD ");
			System.out.println(" 2)SUB ");
			System.out.println(" 3)MUL ");
			System.out.println(" 4)EXIT ");
			System.out.println("*****************************");
			System.out.println("Enter The Choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				demo.add();
				break;
			case 2:
				demo.sub();
				break;
			case 3:
				demo.mul();
				break;
			case 4:
				System.out.println("Thx for Using Appplication");
				System.exit(0);
			default:
				System.out.println("Choose 1 to 4 Between");
			}
		}
// end of while 
	}
}
