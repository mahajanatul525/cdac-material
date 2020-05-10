package mypack;

import java.io.Serializable;

public class Employee implements Serializable
{
	private String name,department;
	private int age;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", department=" + department
				+ ", age=" + age + ", salary=" + salary + "]";
	}
	public Employee(String name, String department, int age, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.age = age;
		this.salary = salary;
	}
	
}
