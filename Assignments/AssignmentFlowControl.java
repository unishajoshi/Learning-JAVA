import java.util.Scanner;

public class AssignmentFlowControl {

	static void assignment1() {
		/*
		 * Assignment 1 ##### ##### ##### ##### #####
		 */
		System.out.println("Assignment 1\n");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("#\t");
			}
			System.out.println();
		}
	}

	static void assignment2() {
		/*
		 * Assignment2
		 * 
		 * @@@@@
		 * 
		 * @ @
		 * 
		 * @ @
		 * 
		 * @ @
		 * 
		 * @@@@@
		 */
		System.out.println("\nAssignment 2\n");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 5)
					System.out.print("@");
				else if (j == 0 || j == 4)
					System.out.print("@");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	static void assignment3() {
		/*
		 * Assignment 3 12345 678910 ..upto 50
		 */
		System.out.println("\nAssignment 3\n");
		for (int i = 1; i <= 50;) {
			for (int j = 0; j < 5; j++) {
				System.out.print(i++ + "\t");
			}
			System.out.println();
		}
	}

	static void assignment4() {
		/*
		 * Assignment 4 246810
		 * 
		 * ..upto 100
		 */
		System.out.println("\nAssignment 4\n");
		for (int i = 1; i <= 100;) {
			for (int j = 0; j < 10; j++) {
				if (i % 2 == 0)
					System.out.print(i++ + "\t");
				else
					i++;
			}
			System.out.println();
		}

	}

	static void assignment5() {
		/*
		 * Assignment 5 13579
		 * 
		 * ..upto 50
		 */
		System.out.println("\nAssignment 5\n");
		for (int i = 1; i <= 50;) {
			for (int j = 0; j < 10; j++) {
				if (i % 2 == 0)
					i++;
				else
					System.out.print(i++ + "\t");
			}
			System.out.println();
		}

	}

	static void assignment6() {
		/*
		 * Assignment 6 AAAAA AAAAA AAAAA AAAAA AAAAA
		 */
		System.out.println("\nAssignment 6\n");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("A" + "\t");
			}
			System.out.println();
		}

	}

	static void assignment7() {
		/*
		 * Assignment 7 ABCDEF ABCDEF ABCDEF ABCDEF ABCDEF
		 */
		System.out.println("\nAssignment 7\n");
		for (int i = 0; i < 5; i++) {
			for (char j = 'A'; j < 'G'; j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}

	}

	static void assignment8() {
		/*
		 * Assignment 8 ***** **** *** ** *
		 */
		System.out.println("\nAssignment 8\n");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i <= j)
					System.out.print("*\t");
			}
			System.out.println();
		}

	}

	static void assignment9() {
		/*
		 * Assignment 9 * ** *** **** ******
		 */
		System.out.println("\nAssignment 9\n");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j <= i)
					System.out.print("*\t");
			}
			System.out.println();
		}
	}

	static void assignment10() {
		/*
		 * Assignment 10 WAP to find out the given number is prime or not
		 */
		System.out.println("\nAssignment 10\n");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is a prime number or not");
		int prime = sc.nextInt();
		boolean flag = false;
		for (int i = 2; i < prime; i++) {
			if (prime % i == 0)
				flag = true;
		}
		if (flag == true)
			System.out.println("The given number is not a Prime Number");
		else
			System.out.println("The given number is a Prime Number");
	}

	static void assignment11() {
		/*
		 * Assignment 11 WAP to find out the given number is even or not
		 */
		System.out.println("\nAssignment 11\n");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether the number is even or not");
		int even = sc.nextInt();
		if (even % 2 == 0)
			System.out.println("The given number is an Even Number");
		else
			System.out.println("The given number is not an Even Number");
	}

	static void assignment12() {
		/*
		 * Assignment 12 WAP to find out the factorial of given number
		 */
		System.out.println("\nAssignment 12\n");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to get the factorial of it");
		int num = sc.nextInt();
		long fact = num;
		System.out.print(num);
		for (int i = num - 1; i >= 1; i--) {
			fact = fact * i;
			System.out.print("*" + i);
		}
		System.out.println("\nFactorial for given value is: " + fact);
	}

//	static void assignment12() {
//		/*
//		 * A new approach to Assignment 12 WAP to find out the factorial of given number
//		 */
//		System.out.println("\nAssignment12\n");
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a number");
//		int num = sc.nextInt();
//		int fact=1;
//		for (int i = num; i >1 ; i--) {
//			fact+= fact*--num;
//			System.out.println(fact+"*"+num);
//		}
//		System.out.println("Factorial for given value is: "+ fact);
//	}		

	static void assignment13() {
		/*
		 * Assignment 13 WAP to find out fibonacci series of the given number
		 */
		System.out.println("\nAssignment 13\n");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to generate the fibonacci series upto that number");
		int num = sc.nextInt();
		int fib = 0;
		for (int i = 1; i <= num;) {
			System.out.print(fib + ", ");
			int temp = i;
			i += fib;
			fib = temp;

		}
		// System.out.println("\nFactorial for given value is: "+ fact);
	}

	static void assignment14() {
		/*
		 * Assignment 14 WAP 1 to 100 out the prime numbers
		 */
		System.out.println("\nAssignment 14\n");
		System.out.println("This assignment is done using  while loop");
		System.out.println("The list of prime numbers between 1 to 100 are as follow:");
		boolean flag = false;
		int i = 1;
		while (i <= 100) {
			flag = false;			
			int j = 2;
			while (j < i) {
				if (i % j == 0)
					flag = true;
				j++;
			}
			if (flag == false)
				System.out.print(i + ", ");
			i++;
		}

	}

	static void assignment15() {
		/*
		 * Assignment 15 WAP 1 to 100 even numbers
		 */
		System.out.println("\nAssignment 15\n");
		System.out.println("This assignment is done using Do while loop");
		System.out.println("The list of even numbers from 1 to 100 are as follow:");
		int i= 1;
		do
		{
			if (i % 2 == 0)
				System.out.print(i+", ");
			i++;
		}
		while(i<=100);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the assignment number between 1-15");
		int asm = sc.nextInt();
		switch (asm) {
		case 1:
			assignment1();
			break;
		case 2:
			assignment2();
			break;
		case 3:
			assignment3();
			break;
		case 4:
			assignment4();
			break;
		case 5:
			assignment5();
			break;
		case 6:
			assignment6();
			break;
		case 7:
			assignment7();
			break;
		case 8:
			assignment8();
			break;
		case 9:
			assignment9();
			break;
		case 10:
			assignment10();
			break;
		case 11:
			assignment11();
			break;
		case 12:
			assignment12();
			break;
		case 13:
			assignment13();
			break;
		case 14:
			assignment14();
			break;
		case 15:
			assignment15();
			break;
		default:
			System.out.println("No assignment found with the " + asm + " number");

		}
	}

}
