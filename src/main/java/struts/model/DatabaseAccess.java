package struts.model;

import java.sql.*;

// Database access class
// Accesses the database to run specific operations
public class DatabaseAccess
{
	// Database name and login credentials
	private static String _databaseName = "user";
	private static String _databaseUsername = "root";
	private static String _databasePassword = "P@ssw0rd!";

	// Verifies the login credentials given
	// Returns true if login credentials are valid
	// Returns false if login credentials are invalid
	public static boolean verifyFromDatabase(String username, String password)
	{
		try
		{
			// Loads the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Establish connection to MySQL database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + _databaseName,
					_databaseUsername, _databasePassword);
			// Create SQL query statement
			Statement statement = connection.createStatement();
			// Query for all users with the given username
			String command = "select * from users where username = '" + username + "'";
			// Execute SQL query and store result
			ResultSet result = statement.executeQuery(command);

			// Gets the next item in the query result
			while (result.next() == true)
			{
				// Compare password
				if (result.getString("password").equals(password))
				{
					return true;
				}
			}

			return false;
		} catch (SQLException ex)
		{
			ex.printStackTrace();
			return false;
		} catch (Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
	}
}
