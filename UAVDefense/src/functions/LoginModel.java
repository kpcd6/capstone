package functions;

import controller.RegisterControl;
import gui.RegisterFrame;
import database.LoginDAO;
import database.RegisterDAO;

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
		RegisterDAO registerDao = new RegisterDAO(); 
		RegisterModel model = new RegisterModel(registerDao); 
		RegisterControl control = new RegisterControl(model, frame); 
	}
}
