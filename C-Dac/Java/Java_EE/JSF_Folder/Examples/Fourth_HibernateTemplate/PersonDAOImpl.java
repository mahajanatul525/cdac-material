package mypack;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.orm.hibernate3.HibernateTemplate;
@ManagedBean(name = "persondaoimpl")
@SessionScoped
public class PersonDAOImpl implements PersonDAO 
{
	public PersonDAOImpl()
	{
		System.out.println("inside Persondaoimpl constr");
	}

	HibernateTemplate template;
	public void setTemplate(HibernateTemplate template) 
	{  
		System.out.println("inside settemplate method");
		    this.template= template;  
	}  

	@Override
	public void savePerson(Person ref) 
	{
		template.save(ref);
	}
}
