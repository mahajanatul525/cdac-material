package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@Entity
@Table
public class Student 
{
	private int rollno;
	private String name;
	private int age;
	private String email;
	
	@NotEmpty(message="email can not be empty")
	@Email(message="invalid email id")
	public String getEmail() {
		return email;
	}
	@Column
	public void setEmail(String email) {
		this.email = email;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@NotEmpty(message="name can not be empty")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "name must contain characters")
	public String getName() {
		return name;
	}
	@Column
	public void setName(String name) {
		this.name = name;
	}
	
	@Range(min=18,max=30,message="age should be between {min} and {max}")
	public int getAge() {
		return age;
	}
	@Column
	public void setAge(int age) {
		this.age = age;
	}
	
}







