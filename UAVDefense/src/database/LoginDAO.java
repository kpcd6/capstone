package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import authentification.PasswordSalts;

public class LoginDAO {
	Connection connection = null; 
	PreparedStatement stmt = null; 
	ResultSet result = null; 
	
	public LoginDAO(){
		
	}
	private Connection getConnection() throws SQLException {
		Connection conn; 
		conn = DBConnection.getInstance().getConnection(); 
		return conn; 
	}
	
	/*Login first checks to see if username exists in the database
	 * if it does, then we do a query using the username 
	 * SELECT * FROM AUTHENTICATE WHERE PlayerUsername = (PlayerUsername)
	 * Use salt and password to hash
	 * and then check 
	 * SELECT * FROM AUTHENTICATE WHERE PlayerUsername = (PlayerUsername) and PlayerPassword = (Password+salt)
	 * 
	 */
	public int attemptLogin(String username, char[] password){
		try{
			String queryString = "SELECT * FROM Authenticate where PlayerUsername=?";
			connection = getConnection(); 
			String pass = new String(password);
			if(password!=null)
			{	
				PreparedStatement ps = connection.prepareStatement(queryString);
				ps.setString(1, username);
				ResultSet rs= ps.executeQuery(); 
				if(rs.next()){
					int ID = rs.getInt("UserID"); 
					String salt = rs.getString("Salt");  
				    String securePassword = PasswordSalts.get_SecurePassword(pass, salt);
					queryString = "SELECT * FROM Authenticate where UserID = ? AND PlayerPassword = ?";
					ps = connection.prepareStatement(queryString);
					ps.setInt(1, ID);
					ps.setString(2,securePassword); 
					rs = ps.executeQuery(); 
					if (rs.next())
					{
						System.out.println(rs.getInt("UserID"));
						System.out.println("Login Successful!");
					}
					else
						System.out.println("Wrong password/username");
			/*		rs.close(); 
					ps.close();
					connection.close();
					return rs.getInt("PlayerID"); */ 
				}
				else{
					System.out.println("Authentification failed");
					System.out.println("Could not find user or password associated with that user");
					rs.close(); 
					ps.close();
					connection.close();
					return 0; 
				}
				
			}
		}
		catch(Exception eee)
		{
			eee.printStackTrace();
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
		return 0;
	}
	
}
