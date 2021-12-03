
public class LoginUser {
	String userId;
	String userName;
	String passWord;
	Long mobileNumber;
	String passHint;
	public LoginUser(String userId, String userName, String passWord, Long mobileNumber, String passHint) {
		this.userId = userId;
		this.userName = userName;
		this.passWord = passWord;
		this.mobileNumber = mobileNumber;
		this.passHint = passHint;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getPassHint() {
		return passHint;
	}
	public void setPassHint(String passHint) {
		this.passHint = passHint;
	}
	
	

}
