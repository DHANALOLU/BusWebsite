package pack;

public class UserDatabase {
 
	String name;
	String email;
	String phoneno;
	String password;
	public UserDatabase(String name,String email , String phoneno,String password)
	{
		this.name=name;
		this.email=email;
		this.phoneno=phoneno;
		this.password=password;
		
	}
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPhoneno() {
		return phoneno;
	}
	
	public String getPassword() {
		return password;
	}

	
}
