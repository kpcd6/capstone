package database;

import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import authentification.*;  
public class RegisterDAO {
	Connection connection = null; 
	PreparedStatement stmt = null; 
	ResultSet result = null; 
	
	public RegisterDAO(){
		
	}
	
	private Connection getConnection() throws SQLException{
		Connection conn; 
		conn = DBConnection.getInstance().getConnection(); 
		return conn; 
	}
	
	/* Function takes in as an input the registration field
	 * Does a form validation
	 * Checks to see if the username is already registered
	 * Checks to see if the email address is already registered
	 * returns an int: 1 if successful registration
	 * 				   0 if unsuccessful registration 
	 */
	public int attemptRegister(String username, char[] password, char[] passwordConfirm,
			String email) throws NoSuchAlgorithmException{
		try{
				connection = getConnection(); 
				String pass = new String(password);
				String confirmPass = new String(passwordConfirm);
				// form validation in the if-statement. I'll come back to this later and make it more professional
				// also need to check minimum length of password/username, validate email 
			if(username!=null && pass!=null && pass.equals(confirmPass)==true && email!=null){	
				PreparedStatement ps;
				ResultSet rs;
				
				String queryString = "SELECT UserID FROM Authenticate WHERE PlayerUsername=?";
				
				ps = connection.prepareStatement(queryString);
				System.out.println(ps);
				ps.setString(1, username); 
				rs = ps.executeQuery();
				if(rs.next()){
					System.out.println("Register Unsuccesful");
					return 1; 
				}else{
					
					//register the user
					String salt = PasswordSalts.getSalt(); 
				    String securePassword = PasswordSalts.get_SecurePassword(pass, salt);
				    System.out.println("try else");
					queryString = "INSERT INTO Authenticate (PlayerUsername, PlayerPassword,Salt) VALUES (?,?,?);";
					ps = connection.prepareStatement(queryString); 
					ps.setString(1, username);
					ps.setString(2, securePassword);
					ps.setString(3, salt);
					System.out.println(ps); 
					ps.executeUpdate(); 
					
					//get the user's ID so that we can create a row in the player table for that user
					queryString = "SELECT UserID FROM Authenticate WHERE PlayerUsername=?";
					ps = connection.prepareStatement(queryString); 
					ps.setString(1,username);
					rs = ps.executeQuery(); 
					rs.next(); 
					int ID = rs.getInt("UserID"); 
					
					//create the row in the player table for that user
					//currently does not work because player table requires scoreboardID
					//this needs to be changed 
					queryString = "INSERT INTO Player (UserID) VALUES(?);";
					ps = connection.prepareStatement(queryString); 
					ps.setInt(1, ID);
					ps.executeUpdate(); 
					System.out.println("Register Successful");
					
				}
			}
			else{
				System.out.println("Error:Check form again");
				return 0;
			}
		}
		catch(SQLException e){
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
		return 1;
		//do query to get new player values and place them into user
	

	}
}
