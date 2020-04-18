package com.sankranthi.vo;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@SuppressWarnings("serial")
public class UserAccount implements Serializable {

	private String uid;
	private String uname;
	private String pword;
	
	
	
	
	public UserAccount( String uname, String pword) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		this.uid = dateFormat.format(date)+uname;
		this.uname = uname;
		this.pword = pword;
	}
	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}
	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}
	/**
	 * @return the pword
	 */
	public String getPword() {
		return pword;
	}
	/**
	 * @param pword the pword to set
	 */
	public void setPword(String pword) {
		this.pword = pword;
	}
	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}


}
