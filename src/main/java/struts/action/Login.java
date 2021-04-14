package struts.action;

import com.opensymphony.xwork2.ActionSupport;
import struts.model.*;

// The Login action class
// acts as a controller
public class Login extends ActionSupport
{

	// Stores user login credentials
	private User user;
	// Error message variable
	private static String message = "";

	// Runs when login action is triggered from jsp
	// Returns success if login credentials are valid
	// Returns fail if login credentials are invalid
	public String execute() throws Exception
	{
		// Calls static method from DatabaseAccess to verify login credentials
		if (DatabaseAccess.verifyFromDatabase(user.getUsername(), user.getPassword()))
		{
			return "success";
		}
		else
		{
			message = "Login Failed";
			return "fail";
		}
	}

	// Gets the user
	public User getUser()
	{
		return user;
	}

	// Sets the user
	public void setUser(User user)
	{
		this.user = user;
	}

	// Gets the message
	public String getMessage()
	{
		return message;
	}
}
