package struts.action;
import java.sql.*;

public class DatabaseAccess {
	
	public static boolean verifyFromDatabase(String username, String password)
	{
		try 
		{
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "P@ssw0rd!");
			Statement statement = connection.createStatement();
			String command = "select * from users where username = '" + username + "'";
			ResultSet result = statement.executeQuery(command);
			System.out.println(command);
			
			while(result.next() == true)
			{
				if(result.getString("password").equals(password))
				{
					return true;
				}
			}
			
			return false;
		}
		catch(SQLException ex) {
	        ex.printStackTrace();
	        return false;
	    }
	}	
}
