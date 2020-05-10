package mypack;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.opensymphony.xwork2.validator.annotations.DateRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;
import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;

@Entity
@Table(name="customer")
public class Customer 
{
private int id;	
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
private String name;
private int age;
private String email;
private String telephone;
private Date dob;
@Column(name="dob")
public Date getDob() {
	return dob;
}
@Override
public String toString() {
	return "Customer [name=" + name + ", age=" + age + ", email=" + email
			+ ", telephone=" + telephone + ", dob=" + dob + "]";
}
@RequiredFieldValidator(type=ValidatorType.FIELD,key="errors.required")
@DateRangeFieldValidator(type=ValidatorType.FIELD,key = "date.range", 
min = "01/01/1990", max = "12/31/1993")
public void setDob(Date dob) {
	this.dob = dob;
}
@Column(name="name")
public String getName() {
     return name;
}
@RequiredStringValidator(type=ValidatorType.FIELD,
      message="Mandatory Field",key="errors.required")
@RegexFieldValidator( key = "errors.string", expression = "^[a-zA-Z]+$")
public void setName(String name) 
{
     this.name = name;
}
@Column(name="age")
public int getAge() 
{
     return age;
}
@IntRangeFieldValidator(type=ValidatorType.FIELD,min="1",max="99",
key="errors.range")
public void setAge(int age) 
{
     this.age = age;
}
@Column(name="email")
public String getEmail() 
{
     return email;
}
@RequiredStringValidator(type=ValidatorType.FIELD,
message="Mandatory Field",key="errors.required")
@EmailValidator(type=ValidatorType.FIELD,message="invalid email id",shortCircuit=true)
@StringLengthFieldValidator(type=ValidatorType.FIELD,
key="errors.length",minLength="7",maxLength="15",trim=true)
public void setEmail(String email) 
{
     this.email = email;
}
@Column(name="telephone")
public String getTelephone() 
{
     return telephone;
}
@RequiredStringValidator(type=ValidatorType.FIELD,
message="Mandatory Field",key="errors.required")
@RegexFieldValidator( key = "errors.invalid", expression = "^[0-9]{10}+$")
public void setTelephone(String telephone) 
{
     this.telephone = telephone;
}
}






