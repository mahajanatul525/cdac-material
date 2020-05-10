package mypack;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="emp")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="empid",nullable=false)
	public int getEmpid() {
		return empid;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Column(name="empname")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Column(name="desig")
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Column(name="salary")
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * 
	 */
	
	private int empid;
	private String name,desig;
	private double salary;

}
