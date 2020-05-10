package mypack;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person  {

	private int prnno;
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="prnno")
	public int getPrnno() {
		return this.prnno;
	}

	@Override
	public String toString() {
		return "Person [prnno=" + prnno + ", name=" + name + ", age=" + age
				+ "]";
	}

	public void setPrnno(int prnno) {
		this.prnno = prnno;
	}
	@Column(name="name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Column(name="age")
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
