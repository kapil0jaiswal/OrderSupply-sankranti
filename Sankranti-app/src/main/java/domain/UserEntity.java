package domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "user_details")
public class UserEntity implements Serializable{
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", emailid=" + emailid
				+ ", username=" + username + ", password=" + password + ", confirm=" + confirm + ", mobile=" + mobile
				+ ", gender=" + gender + ", address=" + address + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstname;
	private String lastname;
	private String emailid;
	private String username;
	private String password;
	private String confirm;
	private String mobile;
	private String gender;
	private String address;

	public UserEntity() {
	}

	public UserEntity(String firstname, String lastname, String emailid, String username, String password,
			String confirm, String mobile, String gender, String address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.username = username;
		this.password = password;
		this.confirm = confirm;
		this.mobile = mobile;
		this.gender = gender;
		this.address = address;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname
	 *            the firstname to set
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
	 * @param lastname
	 *            the lastname to set
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
	 * @param emailid
	 *            the emailid to set
	 */
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
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
	 * @param confirm
	 *            the confirm to set
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
	 * @param mobile
	 *            the mobile to set
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
	 * @param gender
	 *            the gender to set
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
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
