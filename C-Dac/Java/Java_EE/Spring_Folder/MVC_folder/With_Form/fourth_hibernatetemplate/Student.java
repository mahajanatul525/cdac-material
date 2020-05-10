package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student 
{
	private int rollno;
	private String name;
	private int age;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	@Column
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Column
	public void setAge(int age) {
		this.age = age;
	}
	
}
