import java.sql.*;
import java.util.Scanner;

public class StudentDaoImpl implements StudentDao {
	Scanner sc = new Scanner(System.in);
	Connection con = null;
	PreparedStatement ps = null;
	Statement st = null;

	@Override
	public void addStudents() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		con = ConnectionManager.getConnection();
		st = con.createStatement();
		System.out.println("How many records you want to add?");
		int cnt = 0;
		int rec = sc.nextInt();
		ResultSet rss = st.executeQuery("Select max(std_id) from Student;");
		if (rss.next() == false) {
			cnt = 0;
		} else
			cnt = rss.getInt(1);
		for (int i = 0; i < rec; i++) {
			// sc.close();
			int sno = ++cnt;
			System.out.println("Enter the Student First Name");
			String sfname = sc.next();
			System.out.println("Enter the Student Last Name");
			String slname = sc.next();
			System.out.println("Enter the Student Address");
			String sadd = sc.next();

			// con = ConnectionManager.getConnection();
			ps = con.prepareStatement("insert into Student values(?,?,?,?);");
			ps.setInt(1, sno);
			ps.setString(2, sfname);
			ps.setString(3, slname);
			ps.setString(4, sadd);

			int count = ps.executeUpdate();
			if (count != 0)
				System.out.println("Data insersted successfully");
			else
				System.out.println("Data was not inserted");

		}
		ConnectionManager.close(con, ps, null);

	}

	@Override
	public void viewAllStudents() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		con = ConnectionManager.getConnection();
		st = con.createStatement();
		ResultSet rss = st.executeQuery("Select count(*) from Student;");
		rss.next();
		int count = rss.getInt(1);
		if (count != 0) {
			ResultSet rs = st.executeQuery("select std_id,std_fname,std_lname,std_add from Student;");
			while (rs.next()) {
				System.out.println("\n");
				System.out.print("\tID: " + rs.getInt(1));
				System.out.print("\tFirst Name: " + rs.getString(2));
				System.out.print("\tLast Name: " + rs.getString(3));
				System.out.print("\tAddress: " + rs.getString(4));
			}
			System.out.println("\n");
			System.out.println("All student data are retrived Successfully");
		} else {
			System.out.println("No records found");
		}

		ConnectionManager.close(con, null, st);

	}

	@Override
	public void viewStudent(int sno) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		con = ConnectionManager.getConnection();
		ps = con.prepareStatement("Select count(*) from Student where std_id = ?;");
		ps.setInt(1, sno);
		ResultSet rss = ps.executeQuery();
		rss.next();
		int count = rss.getInt(1);
		if (count != 0) {
			ps = con.prepareStatement("select std_id,std_fname,std_lname,std_add from Student where std_id= ?;");
			ps.setInt(1, sno);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println();
				System.out.print("ID: " + rs.getInt(1));
				System.out.print("\tFirst Name: " + rs.getString(2));
				System.out.print("\tLast Name: " + rs.getString(3));
				System.out.print("\tAddress: " + rs.getString(4));
			}
			System.out.println();
			System.out.println("Student data are retrived Successfully");
		} else {
			System.out.println("No records found");
		}

		ConnectionManager.close(con, ps, null);

	}

	@Override
	public void deleteStudent(int sno) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		con = ConnectionManager.getConnection();
		ps = con.prepareStatement("Select count(*) from Student where std_id = ?;");
		ps.setInt(1, sno);
		ResultSet rss = ps.executeQuery();
		rss.next();
		int count = rss.getInt(1);
		if (count != 0) {
			ps = con.prepareStatement("Delete from student where  std_id = ?;");
			ps.setInt(1, sno);
			int cnt = ps.executeUpdate();
			if (cnt != 0) {
				System.out.println("Student record was deleted successfully");
			} else {
				System.out.println("Student record was not deleted");
			}
			ConnectionManager.close(con, ps, null);

		}
	}

	@Override
	public void updateStudent(int sno) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		con = ConnectionManager.getConnection();
		ps = con.prepareStatement("Select count(*) from Student where std_id= ?;");
		ps.setInt(1, sno);
		ResultSet rss = ps.executeQuery();
		rss.next();
		int count = rss.getInt(1);
		if (count != 0) {
			System.out.println("Enter the updated First Name of the Student");
			String sfname = sc.next();
			System.out.println("Enter the updated Last Name of the Student");
			String slname = sc.next();
			System.out.println("Enter the updated Address of the Student");
			String sadd = sc.next();
			ps = con.prepareStatement(
					"update Student set std_id = ? , std_fname = ? , std_lname= ? , std_add = ? where std_id = ?;");
			ps.setInt(1, sno);
			ps.setString(2, sfname);
			ps.setString(3, slname);
			ps.setString(4, sadd);
			ps.setInt(5, sno);
			int cnt = ps.executeUpdate();
			if (cnt != 0) {
				System.out.println("Student updated Successfully");
			} else {
				System.out.println("Student record could not be updated");
			}
			ConnectionManager.close(con, ps, st);

		} else {
			System.out.println("No records found");
		}
	}

}
