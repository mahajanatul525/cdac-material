package mypack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("personbeanaction")
public class PersonBeanAction
{
	//private static final long serialVersionUID = 1L;
	public PersonBeanAction()
	{
		System.out.println("inside Personbeanaction constr");
	}
	

	@Autowired(required=true)
	PersonDAO persondao;

	@Autowired
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
