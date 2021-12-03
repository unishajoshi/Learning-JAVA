import java.util.Scanner;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		StudentDaoImpl daoImpl = new StudentDaoImpl();

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
				daoImpl.addStudents();
				break;

			}
			case 2: {
				Student[] viewRecords = daoImpl.viewAllStudents();
				for (Student stu : viewRecords) {
					if (stu != null)
						System.out.println(stu.getSno() + "\t" + stu.getSname() + "\t" + stu.getSadd() + "\t"
								+ stu.getMobileNumber());
				}
				break;
			}
			case 3: {
				System.out.println("Enter the Student Number");
				Student stu = daoImpl.viewStudent(sc.nextInt());
				if (stu != null)
					System.out.println(
							stu.getSno() + "\t" + stu.getSname() + "\t" + stu.getSadd() + "\t" + stu.getMobileNumber());
				else
					System.out.println("Student Record Not Fould");
				break;
			}
			case 4: {
				System.out.println("Enter the Student Number");
				Student stu = daoImpl.updateStudent(sc.nextInt());
				if (stu != null) {
					System.out.println("The updated information of the Students are");
					System.out.println(
							stu.getSno() + "\t" + stu.getSname() + "\t" + stu.getSadd() + "\t" + stu.getMobileNumber());
				} else
					System.out.println("Student record could not be updated");
				break;
			}
			case 5: {

				System.out.println("Enter the Student Number");
				daoImpl.deleteStudent(sc.nextInt());
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
