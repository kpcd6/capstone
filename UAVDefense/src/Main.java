import functions.LoginModel;
import java.io.IOException;
import java.sql.SQLException;
import controller.LoginControl;
import database.LoginDAO;
import gui.LoginFrame;

public class Main {
	
	public static void main(String[] args) throws IOException, SQLException {
		LoginFrame frame = new LoginFrame(); 
		LoginDAO loginDao = new LoginDAO(); 
		LoginModel model = new LoginModel(loginDao);
		LoginControl controller = new LoginControl(model, frame); 
	}
	
}
