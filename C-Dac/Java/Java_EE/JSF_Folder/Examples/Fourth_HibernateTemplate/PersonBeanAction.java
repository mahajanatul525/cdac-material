package mypack;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="personbeanaction")
@SessionScoped
public class PersonBeanAction
{
	//private static final long serialVersionUID = 1L;
	public PersonBeanAction()
	{
		System.out.println("inside Personbeanaction constr");
	}
	
	
	@ManagedProperty("#{persondaoimpl}")
	PersonDAO persondao;
	public void setPersondao(PersonDAO persondao) {
		System.out.println("inside setpersondao method");
		this.persondao = persondao;
	}

		        
	@ManagedProperty("#{person}")
	private Person person;
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		System.out.println("inside setperson method");
		this.person = person;
	}

	public String addPerson()
	{
	
	persondao.savePerson(person);
		
        return "success";
	}
}
