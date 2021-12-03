import java.util.Scanner;

public class StudentDaoImpl {
	Scanner sc = new Scanner(System.in);
	static Student addStudents[] = new Student[5];
	
	void addStudents() {
		try {
		for(int i = 0;i<5;i++) {
			System.out.println("Enter the Student Number");
			//sc.close();
			int sno = sc.nextInt();
			System.out.println("Enter the Student Name");
			String sname = sc.next();
			System.out.println("Enter the Student Address");
			String sadd = sc.next();
			System.out.println("Enter the Student Mobine Number");
			long mb = sc.nextLong();
			Student sb = new Student(sno,sname,sadd,mb);
			addStudents[i] = sb;
			System.out.println("Student Added Successfully");
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	
	}
	
	Student []viewAllStudents(){
		return addStudents;
		
	}
	Student viewStudent(int sno) {
		for (Student stu : addStudents) {
			if(stu.getSno() == sno)
				return stu;
		}
		return null;
	}
	void deleteStudent(int sno) {
		int k=0;
		int m=0;
		for (Student stu : addStudents) {
			if(stu.getSno() == sno) {
				addStudents[k] = null;
				System.out.println("Student record is Deleted Successfully");
				k++;
				m++;
			}
			else {
				k++;
			}
		}
		if(m==0)
			System.out.println("Record is not found");
		
	}
	Student updateStudent(int sno) {
		for(Student stu : addStudents) {
			if(stu.sno == sno) {
				System.out.println("Enter the updated Name of the Student");
				stu.sname = sc.next();
				System.out.println("Enter the updated Address of the Student");
				stu.sadd = sc.next();
				System.out.println("Enter the updated Mobile number of the Student");
				stu.mobileNumber = sc.nextLong();
				return stu;
			}
		}
		return null;
		
	}


}
