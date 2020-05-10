package mypack;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity
public class Student implements Serializable 
{
	private int rollno;
	private String name;
	private int age;
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}   
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getRollno() {
		return this.rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
   
}
