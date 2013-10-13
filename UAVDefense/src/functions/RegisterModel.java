package functions;

import java.security.NoSuchAlgorithmException;

import database.RegisterDAO;

public class RegisterModel {
	RegisterDAO registerDao; 
	public RegisterModel(RegisterDAO registerDao){
		this.registerDao = registerDao;
	}
	public void attemptRegister(String username, char[] password, char[] confirmPassword, String email) throws NoSuchAlgorithmException {
		registerDao.attemptRegister(username, password, confirmPassword, email); 
	}
}
