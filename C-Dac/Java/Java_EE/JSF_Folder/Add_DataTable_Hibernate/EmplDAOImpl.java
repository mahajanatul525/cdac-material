package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component("empdaoimpl")
public class EmplDAOImpl implements EmplDAO 
{
	
	@Autowired
	HibernateTemplate template;
	

	@Override
	public void saveEmployee(Empl ref) 
	{
		System.out.println("inside saveEmployee\t"+ref.getName()+ref.getDesig()+ref.getSalary());
		template.save(ref);
	}


	@Override
	public List getAllEmployees() {
		// TODO Auto-generated method stub
		List mylist=template.find("from Empl");
		return mylist;
	}
}
