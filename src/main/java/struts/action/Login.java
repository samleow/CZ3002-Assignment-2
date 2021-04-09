package struts.action;

import com.opensymphony.xwork2.ActionSupport;
import struts.model.*;

public class Login extends ActionSupport{
	
	private User user;
	private static String message = "";
	
	public String execute() throws Exception {
		
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		
		if(DatabaseAccess.verifyFromDatabase(user.getUsername(), user.getPassword()))
		{
	        return "success";
		}
		else
		{
			message = "Login Failed";
			return "fail";
		}
    }
	
	public User getUser()
	{
		return user;
	}
	
	public void setUser(User user)
	{
		this.user = user;
	}
	
	public String getMessage()
	{
		return message;
	}
}
