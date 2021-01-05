import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


@ManagedBean(name = "auth")
@ViewScoped
public class loginAuth {
	private String username="YousefAlshboul";
	private String password="User1234";
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPass()
	{
		return password;
	}
	public void setPass(String password)
	{
		this.password=password;
	}
	public void loggedIn() throws IOException
	{
		FacesContext context = FacesContext.getCurrentInstance();
		if(this.username.equals("YousefAlshboul") && this.password.equals("User1234"))
				{
					context.getExternalContext().getSessionMap().put("user", username);
					
					try {
						context.getExternalContext().redirect("EmpDetails.xhtml");
						}
					
					catch (IOException e)
					{
						e.printStackTrace();
					}
				}
		else
		{
			context.getExternalContext().redirect("index.xhtml");
		}
	}
		
	
}
