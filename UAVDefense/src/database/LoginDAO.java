package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

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
	
	public int attemptLogin(String username, char[] password){
		try{
			String queryString = "SELECT PlayerID FROM Authenticate where PlayerUsername=? "
					+ "and PlayerPassword=?";
			connection = getConnection(); 
			String pass = new String(password);
			if(password!=null)
			{	
				PreparedStatement ps = connection.prepareStatement(queryString);
				ps.setString(1, username);
				ps.setString(2, pass);
				ResultSet rs= ps.executeQuery(); 
				if(rs.next()){
					System.out.println("Authentification successful");
					rs.close(); 
					ps.close();
					connection.close();
					return rs.getInt("PlayerID"); 
				}
				else{
					System.out.println("Authentification failed");
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
