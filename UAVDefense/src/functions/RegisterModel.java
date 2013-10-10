package functions;

import java.security.NoSuchAlgorithmException;

import gui.RegisterFrame;
import database.RegisterDAO;

public class RegisterModel {
	RegisterDAO registerDao; 
	public RegisterModel(RegisterDAO registerDao){
		this.registerDao = registerDao;
	}
	public void attemptLogin(String username, char[] password, char[] confirmPassword, String email) throws NoSuchAlgorithmException {
		registerDao.attemptRegister(username, password, confirmPassword, email); 
	}
	public void attemptRegister()
	{
		RegisterFrame frame = new RegisterFrame(); 
	}
}
