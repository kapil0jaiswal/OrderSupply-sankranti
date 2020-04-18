/**
 * 
 */
package com.sankranthi.presentation;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import com.sankranthi.domain.User;
import com.sankranthi.service.UserRegisterService;




/**
 * @author Kapil
 *
 */

@SuppressWarnings("serial")
@ManagedBean(name = "register")
@ViewScoped
public class RegisterationController implements Serializable {

	
	private String firstname ;
	private String lastname;
	private String emailid;
	private String username;
	private String password;
	private String confirm;
	private String 	mobile;
	private String gender;
	private String address;
	
	@Inject
	private UserRegisterService userRegisterService;
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * @return the emailid
	 */
	public String getEmailid() {
		return emailid;
	}
	/**
	 * @param emailid the emailid to set
	 */
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the confirm
	 */
	public String getConfirm() {
		return confirm;
	}
	/**
	 * @param confirm the confirm to set
	 */
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public String submit() {
		User user = new User();
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setUsername(username);
		user.setPassword(password);
		user.setConfirm(confirm);
		user.setMobile(mobile);
		user.setEmailid(emailid);
		user.setGender(gender);
		user.setAddress(address);
		
		
		userRegisterService.submit(user);
		
		return "login.xhtml";



	}

}
