package mypack;
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;  
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
  
@NamedQueries(  
	    {  	
	        @NamedQuery(  
	        name = "findEmployeeByName",  
	        query = "from Employee e where e.name = :name"  
	        ), 
	        @NamedQuery(  
	    	 name = "findEmployeeBySalary",  
	    	 query = "from Employee e where e.salary>?"  
	    	)  
	    }  
	)  

@Entity  
public class Employee  
{  
    private Long id;  
    private String name,desig; 
    private double salary;
       
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"\t"+desig+"\t"+salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
    public Long getId()  
    {  
        return id;  
    }  
    public void setId(Long id)  
    {  
        this.id = id;  
    }  
   
  
   
}  
