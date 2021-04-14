package struts.model;
import java.sql.*;

public class DatabaseAccess {
	
	// Database name and login credentials
	private static String _databaseName =		"user";
	private static String _databaseUsername =	"root";
	private static String _databasePassword =	"P@ssw0rd!";
	
	public static boolean verifyFromDatabase(String username, String password)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + _databaseName, _databaseUsername, _databasePassword);
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
		catch(Exception ex) {
	        ex.printStackTrace();
	        return false;
	    }
	}	
}
