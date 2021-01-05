import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean(name = "details")
@ViewScoped
public class EmpDetails extends loginAuth {
	private int id=1;
	private String name="Yousef";
	private double salary=550.500;
	private String email="yousef.shboul7@gmail.com";
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void handle(String name,double salary,String email)
	{
		if (id==1)
		{
			this.name=name;
			this.salary=salary;
			this.email=email;
		}
	}
	
	
	

}
