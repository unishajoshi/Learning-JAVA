import java.util.Scanner;

public class AssignmentArrayDemo {
	Scanner sc = new Scanner(System.in);

	void assignment1() {
		// display the array in matrix form
		int ar[][] = new int[3][3];
		int add[] = new int[3];
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.println("Enter the values of " + (i + 1) + " row and " + (j + 1) + " column");
				ar[i][j] = sc.nextInt();
				add[i] = add[i] + ar[i][j];
			}
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + "\t");
			}
			System.out.print("=\t" + add[i]);
			System.out.println();
		}

	}

	void assignment2() {
		// find the max value
		int armax = 0;
		int ar[] = new int[10];
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Please enter a value for the array");
			ar[i] = sc.nextInt();
			if (i == 0)
				armax = ar[i];

			if (armax < ar[i])
				armax = ar[i];
		}
		System.out.println("The maximum value in the given array is: " + armax);

	}

	void assignment3() {
		// find the min value
		int armin = 0;
		int ar[] = new int[10];
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Please enter a value for the array");
			ar[i] = sc.nextInt();
			if (i == 0)
				armin = ar[i];
			if (armin > ar[i])
				armin = ar[i];
		}
		System.out.println("The minimum value in the given array is: " + armin);

	}

	void assignment4() {
		// remove the duplicate value
		int ar[] = new int[10];
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Please enter a value for the array");
			ar[i] = sc.nextInt();
		}
		for (int i = 0; i < ar.length; i++) {
			for (int j = i; j > ar.length; j++) {
				if (ar[i] == ar[j]) {
					System.out.print("The removed value is" + ar[i]);
					ar[i] = (Integer) null;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

	void assignment5() {
		// find the even number in array
		int ar[] = new int[10];
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Please enter a value for the array");
			ar[i] = sc.nextInt();
		}
		System.out.println("*****************************************");
		System.out.println("The list of even numbers in your given array are:");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0)
				System.out.print(ar[i] + "\t");
		}
	}

	void assignment6() {
		// find the prime number in array
		int ar[] = new int[5];
		boolean flag = false;
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Please enter a value for the array");
			ar[i] = sc.nextInt();
		}
		System.out.println("*****************************************");
		System.out.println("The list of prime numbers in your given array are:");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 2; j < ar[i]; j++) {
				if (ar[i] % j == 0)
					flag = true;
			}
			if (flag == false)
				System.out.print(ar[i] + "\t");
			else
				flag = false;
		}

	}

	void assignment7() {
		// bubble sort
		int ar[] = new int[6];
		int temp;
		int i;
		for (i = 0; i < ar.length; i++) {
			System.out.println("Please enter a value for the array");
			ar[i] = sc.nextInt();
		}
		for (i = 0; i < ar.length; i++) {// 2 5 8 4 2 1
			for (int j = i; j < ar.length; j++) {
				if (ar[j] < ar[i]) { // first j loop complete 1 5 8 4 2 2
					temp = ar[i]; // 2nd loop 1 2 8 5 4 2
					ar[i] = ar[j]; // 3rd loop
					ar[j] = temp;
				}

			}
		}
		System.out.println("*************************************");
		System.out.println("Array sorted in ascending order using the bubble sort method");
		for (i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + "\t");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentArrayDemo arr = new AssignmentArrayDemo();
		System.out.println("Enter the assignment number between 1-7");
		
		int asm = arr.sc.nextInt();
		switch (asm) {
		case 1:
			arr.assignment1();
			break;
		case 2:
			arr.assignment2();
			break;
		case 3:
			arr.assignment3();
			break;
		case 4:
			arr.assignment4();
			break;
		case 5:
			arr.assignment5();
			break;
		case 6:
			arr.assignment6();
			break;
		case 7:
			arr.assignment7();
			break;
		default:
			System.out.println("No assignment found with the " + asm + " number");

		}
	}

}
