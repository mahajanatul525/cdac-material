package mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component("empdaoimpl")
public class EmpDAOImpl implements EmpDAO 
{
	
	@Autowired
	HibernateTemplate template;

	@Override
	public void updateEmp(Emp ref) {
		// TODO Auto-generated method stub
		
		template.update(ref);
		
	}

	@Override
	public List getAllEmployees() {
		// TODO Auto-generated method stub
		List mylist=template.find("from Emp");
		return mylist;
	}
	

	
}
