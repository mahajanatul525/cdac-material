/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mypack;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.opensymphony.xwork2.validator.annotations.ValidatorType;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Administrator
 */
@Validations
public class RegisterAction extends ActionSupport 
{
    private String name;
    private String address;
    private int age;
    private String email;

    @RequiredStringValidator(message="address can not be blank")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    @IntRangeFieldValidator(min="18",max="58",message="age must be between ${min} and ${max}")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @EmailValidator(message="enter valid email id")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @RequiredStringValidator(message="name can not be blank")
    @StringLengthFieldValidator(type=ValidatorType.FIELD,
	message="Name should contain min of 4 characters and max 10 charcters",
	minLength="4",maxLength="10",trim=true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String execute()
    {
        return "success";
    }

  
}
