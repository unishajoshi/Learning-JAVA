import java.util.Scanner;

public class LoginClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LoginDaoImpl daoImpl = new LoginDaoImpl();
		while (true) {
			System.out.println("*******************************************");
			System.out.println("          1.Register user                  ");
			System.out.println("          2.Login                          ");
			System.out.println("          3.Update Password                ");
			System.out.println("          4.Update Login Inforamtion       ");
			System.out.println("          5.Forgot Password                ");
			System.out.println("          6.Forgot Username                ");
			System.out.println("          7.Delete user                    ");
			System.out.println("          8.Logout                         ");
			System.out.println("          9.Exit                           ");
			System.out.println("*******************************************");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:{
				daoImpl.registerUser();
				break;
			}
			case 2:
			{				
				daoImpl.loginUser();			
				break;
			}
			case 3:
			{
				LoginUser usr = daoImpl.updatePass();
				if(usr !=null) {
				System.out.println("password update successful for the user "+usr.userId);
				}
				else
					System.out.println("unfortunately password update was not successful");
				break;
			}
			case 4:
			{
				LoginUser usr = daoImpl.updateAll();
				if(usr !=null) {
				System.out.println("user information update successful for the user "+usr.userId);
				}
				else
					System.out.println("unfortunately user information update was not successful");
				break;
			}
			case 5:
			{
				System.out.println("enter your userid");
				String uid = sc.next();
				System.out.println("Enter your password hint");
				String passHint = sc.next();
				daoImpl.forgotPass(uid,passHint);
				break;
			}
			case 6:
			{
				System.out.println("Enter your mobile number");
				Long mobNo= sc.nextLong();
				daoImpl.forgetUser(mobNo);
				break;
			
			}
			
			case 7:
			{
				LoginUser usr = daoImpl.deleteUser();
				if(usr !=null) {
					System.out.println("User deletion successfull");
				}
				else
					System.out.println("user not found");
				break;
			}
			case 8:
				daoImpl.logoutUser();
				break;
			case 9:
			{
				System.out.println("Thank you for using app");
				System.exit(0);
				break;
			}
			default:
				System.out.println("Please enter the number between 1 to 9");

			}

		} // end of while
	}

}
