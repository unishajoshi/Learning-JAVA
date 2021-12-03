import java.sql.SQLException;

public interface StudentDao {
	void addStudents() throws ClassNotFoundException, SQLException;
	void viewAllStudents() throws ClassNotFoundException, SQLException;
	void viewStudent(int sno) throws ClassNotFoundException, SQLException;
	void deleteStudent(int sno) throws ClassNotFoundException, SQLException;
	void updateStudent(int sno) throws ClassNotFoundException, SQLException;
}
