import java.sql.*;


public class ConnectionManager {

	public static Connection con;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		// Step1: Register Driver
	//	 DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		// registering the driver using forName method
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Step2: Establish connection with DB s/w

		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaclass_test", "root", "root");

		if (con != null)
			System.out.println("JDBC Connection is successful");
		else
			System.out.println("JDBC Connection faliure");

		return con;
	}
	public static void close(Connection con,PreparedStatement ps,Statement st) throws SQLException {
		//Step5: release the resource
		if(ps!=null) {
			ps.close();
			System.out.println("JDBC Prepared Statement closed successfully");	
		}
		if(st!=null) {
			st.close();
			System.out.println("JDBC Statement closed successfully");
		}
		if(con!=null){
			con.close();
			System.out.println("JDBC Connection closed successfully");
		}
		
		
	}
}
