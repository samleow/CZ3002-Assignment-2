package action;

import com.opensymphony.xwork2.ActionSupport;
import main.model.*;

public class Login extends ActionSupport{
	private User user;
	
	public String execute() throws Exception {       
        return SUCCESS;
    }
}
