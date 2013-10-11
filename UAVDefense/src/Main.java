import functions.LoginModel;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;


import controller.LoginControl;
import database.Datasource;
import database.LoginDAO;
import gui.LoginFrame;
import java.sql.Connection;


public class Main {
	
	public static void main(String[] args) throws IOException, SQLException {
		//start the connection pool
		Datasource ds = Datasource.getInstance();
		System.out.println("get a connection");
		//get a connection 
	    Connection connection = ds.getConnection();
	    
	    
	    //start the main GUI. 
		LoginFrame frame = new LoginFrame(); 
		LoginDAO loginDao = new LoginDAO(); 
		LoginModel model = new LoginModel(loginDao);
		LoginControl controller = new LoginControl(model, frame); 
	}
	
}
