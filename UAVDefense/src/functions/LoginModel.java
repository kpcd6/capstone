package functions;

import gui.RegisterFrame;
import database.LoginDAO;

public class LoginModel {
	LoginDAO loginDao; 
	public LoginModel(LoginDAO loginDao){
		this.loginDao = loginDao;
	}
	public void attemptLogin(String username, char[] password) {
		loginDao.attemptLogin(username, password); 
	}
	public void attemptRegister()
	{
		RegisterFrame frame = new RegisterFrame(); 
	}
}
