package mypack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.springframework.stereotype.Component;

@Component(value="employeedaofileimpl")
public class EmployeeDAOFileImpl implements EmployeeDAO {

	@Override
	public void insertEmployee(Employee ref) 
	{
		try
		{
			FileOutputStream fos=new FileOutputStream("e:\\trial.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(ref);
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

	@Override
	public Employee getEmployee() 
	{
		Employee ref=null;
		try
		{
			FileInputStream fos=new FileInputStream("e:\\trial.txt");
			ObjectInputStream ois=new ObjectInputStream(fos);
			ref=(Employee)ois.readObject();
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}
		return ref;
	}

}
