package authentification;

public class User {
	private int ID; 
	private String userName; 
	private String firstName;
	private String lastName;
	private String email; 
	
	public User (int id, String username, String fName, String lName, String mail){
		userName = username; 
		firstName = fName; 
		lastName = lName; 
		email = mail; 
		ID = id; 
	}
	
	public String getUserName(){
		return userName; 
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName; 
	}
	public String getEmail(){
		return email; 
	}
	public int getID(){
		return ID; 
	}
	/*
	public String setUserName(){
		//use DAO to set UserName
		//edit form
	}
	public String setfName(){
		//use DAO to set first name
		//edit form
	}
	public String setlName(){
		//use DAO to set last name
		//edit form
	}
	*/ 
	
}
