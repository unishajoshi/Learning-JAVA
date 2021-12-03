import java.sql.SQLException;
import java.util.Scanner;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		StudentDao daoImpl = new StudentDaoImpl();

		while (true) {
			
			System.out.println("***************************");
			System.out.println("\t1.Add Student");
			System.out.println("\t2.View All Student");
			System.out.println("\t3.View Student");
			System.out.println("\t4.Update Student");
			System.out.println("\t5.Delete Student");
			System.out.println("\t6.Exit");
			System.out.println("****************************");
			System.out.println("Enter your Choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				try {
					daoImpl.addStudents();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			}
			case 2: {
				try {
					daoImpl.viewAllStudents();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 3: {
				System.out.println("Enter the Student Number");
				try {
					daoImpl.viewStudent(sc.nextInt());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 4: {
				System.out.println("Enter the Student Number");
				try {
					daoImpl.updateStudent(sc.nextInt());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 5: {

				System.out.println("Enter the Student Number");
				try {
					daoImpl.deleteStudent(sc.nextInt());
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}
			case 6: {
				System.out.println("Thank you for using our app");
				// sc.close();
				System.exit(0);

			}
			default: {
				System.out.println("Please try with valid option between 1 to 6");
			}

			}

		} // end of while

	}
}
