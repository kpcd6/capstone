package database;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import authentification.PasswordSalts;

public class RegisterDAO {
	Connection connection = null; 
	PreparedStatement stmt = null; 
	ResultSet result = null; 
	
	public RegisterDAO(){
		
	}
	private Connection getConnection() throws SQLException {
		Connection conn; 
		conn = DBConnection.getInstance().getConnection(); 
		return conn; 
	}
	
	public int attemptRegister(String username, char[] password, char[] passwordConfirm,
			String email) throws NoSuchAlgorithmException{
		try{
			connection = getConnection(); 
			String pass = new String(password);
			String confirmPass = new String(passwordConfirm);
			
			// form validation in the if-statement. I'll come back to this later and make it more professional
			// also need to check minimum length of password/username, validate email. 
			if(username!=null && pass!=null && pass == confirmPass && email!=null)
			{	
			    String salt = PasswordSalts.getSalt(); 
			    String securePassword = PasswordSalts.get_SecurePassword(pass, salt);
				String queryString = "INSERT INTO Authenticate (PlayerUsername, PlayerPassword) where PlayerUsername=? "
						+ "and PlayerPassword=?";
				PreparedStatement ps = connection.prepareStatement(queryString);
				ps.setString(1, username);
				ps.setString(2, securePassword);
				ps.executeUpdate(); 
				System.out.println("Register Successful");
				
			}
			else{
				System.out.println("Error:Check form again");
				return 1; //failure
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}finally{
			try{
				if(stmt != null)
					stmt.close(); 
				if(connection != null)
					connection.close();
				
			}catch (SQLException e){
				e.printStackTrace(); 
			}catch(Exception e){
				e.printStackTrace( );
			}
		}
		return 0; //success
	}
	
}
