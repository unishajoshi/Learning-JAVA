import java.util.Scanner;

public class LoginDaoImpl {
	LoginUser userInfo[] = new LoginUser[2];
	Scanner sc = new Scanner(System.in);
	static boolean loginFlag = false;
	String loginUserId;

	void registerUser() {
	for (int i = 0; i < 2; i++) {
				System.out.println("enter user name");
				String userName = sc.next();
				System.out.println("enter user id");
				String userId = sc.next();
				System.out.println("enter user password");
				String passWord = sc.next();
				System.out.println("enter your mobile number");
				long mobileNumber = sc.nextLong();
				System.out.println("enter the password hint");
				String passHint = sc.next();
				LoginUser usr = new LoginUser(userId, userName, passWord, mobileNumber, passHint);
				userInfo[i] = usr;
				System.out.println();
				// System.out.println(userInfo[i].userId+"\t"+userInfo[i].passWord);
				System.out.println("User registered successfully");
				loginFlag = false;
			}
		} 



	void loginUser() {
		while (true) {
			System.out.println("Enter your userid");
			String uid = sc.next();
			System.out.println("Enter your password");
			String pwd = sc.next();

			for (LoginUser usr : userInfo) {
				if (uid.equals(usr.userId) && pwd.equals(usr.passWord)) {
					loginFlag = true;
					loginUserId = uid;
					System.out.println("User login Successful");
					return;
				}

			}
			System.out.println("User login Failed, please try again");
			System.out.println("Do you want to try loggin in again(Y/N)?");
			if (sc.next().equalsIgnoreCase("N")) {
				return;
			}
		} // end of while
	}

	void logoutUser() {
		if (loginFlag == true) {
			for (LoginUser usr : userInfo) {
				if (loginUserId.equals(usr.userId)) {
					loginFlag = false;
					loginUserId = "";
					System.out.println("The user is logged out");
				}
			}
		} else
			System.out.println("You need to login before you logout");
	}

	LoginUser deleteUser() {
		while (true) {
			int k = 0;
			if (loginFlag == true) {
				for (LoginUser usr : userInfo) {
					if (loginUserId.equals(usr.userId)) {
						userInfo[k] = null;
						loginUserId = null;
						loginFlag = false;
						// System.out.println(userInfo[k].userId+"\t"+userInfo[k].passWord);
						k++;
						return usr;
					} else
						k++;
				}
			} else {
				System.out.println("You need to login before you delete your user");
				System.out.println("Do you want to login?(Y/N)");
				if (sc.next().equalsIgnoreCase("Y")) {
					loginUser();
				} else
					return null;
			}
		} // end of while
	}

	LoginUser updatePass() {
		while (true) {
			int i = 0;
			if (loginFlag == true) {
				for (LoginUser usr : userInfo) {
					if (loginUserId.equals(usr.userId)) {
						System.out.println("Enter a new password");
						String pass1 = sc.next();
						System.out.println("Confirm a new password");
						String pass2 = sc.next();
						if (pass1.equals(pass2)) {
							userInfo[i].setPassWord(pass1);
							i++;
							return usr;
						} else {
							System.out.println("New password and confirm password didnot match");
						}
					} else
						i++;
				}
			} else {
				System.out.println("You need to login before you update your password");
				System.out.println("Do you want to login?(Y/N)");
				if (sc.next().equalsIgnoreCase("Y")) {
					loginUser();
				} else
					return null;
			}
		} // end of while
	}

	LoginUser updateAll() {
		while (true) {
			int i = 0;
			if (loginFlag == true) {
				for (LoginUser usr : userInfo) {
					if (loginUserId.equals(usr.userId)) {
						System.out.println("Enter a new username");
						userInfo[i].setUserName(sc.next());
						System.out.println("Enter a new password");
						userInfo[i].setPassWord(sc.next());
						System.out.println("Enter a new mobile number");
						userInfo[i].setMobileNumber(sc.nextLong());
						System.out.println("Enter a new passord hint");
						userInfo[i].setPassHint(sc.next());
						i++;
						return usr;
					} else
						i++;
				}
			} else {
				System.out.println("You need to login before you update your informations");
				System.out.println("Do you want to login?(Y/N)");
				if (sc.next().equalsIgnoreCase("Y")) {
					loginUser();
				} else
					return null;
			}
		} // end of while
	}

	void forgotPass(String uid, String passHint) {
		int i = 0;
		for (LoginUser usr : userInfo)

		{
			if (uid.equals(usr.userId) && passHint.equals(usr.passHint)) {
				System.out.println("Enter a new password");
				String pass1 = sc.next();
				System.out.println("Confirm a new password");
				String pass2 = sc.next();
				if (pass1.equals(pass2)) {
					userInfo[i].setPassWord(pass1);
					System.out.println("Password updated successfully");
					i++;
					return;
				} else {
					System.out.println("New password and confirm password didnot match");

				}

			} else
				i++;
		}
	}

	void forgetUser(Long mobNo) {
		for (LoginUser usr : userInfo) {
			if (mobNo == usr.mobileNumber) {
				System.out.println("Your userid is:" + usr.userId);
				System.out.println("Try using this userid");
				return;
			}

		}
		System.out.println("No userid associated to this mobile number is found");
	}
}
