/**
 * 
 */
package com.sankranthi.presentation;

import java.io.Serializable;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import com.sankranthi.vo.UserAccount;

/**
 * @author Kapil
 *
 */

@SuppressWarnings("serial")
@ManagedBean
@SessionScoped
public class LoginController implements Serializable {

	private String uname;
	private String pword;
	private boolean isLogin=false;
	private UserAccount userAccount;
	

	public void verifyLogin() {
		if(!isLogin) {
			doRedirect("index.xhtml");
		}
	}
	
	private void doRedirect(String url){
		try
		{
		FacesContext context = FacesContext.getCurrentInstance();
		context.getExternalContext().redirect(url);

		}catch(Exception ex) {
		ex.getMessage();
		}
	}
	
	public void loginX() {
		FacesContext context = FacesContext.getCurrentInstance(); 
		if (this.uname.equals("admin") && this.pword.equals("pwd")) {
			isLogin = true;
			UserAccount userAccount =new UserAccount(uname,pword);
	        context.addMessage(null, new FacesMessage("Successful",  "loginSuccess ") );
	        context.getExternalContext().getSessionMap().put("user",userAccount);
	        doRedirect("order.xhtml");
		}else if (this.uname.equals("user") && this.pword.equals("pwd")) {
			isLogin = true;
			UserAccount userAccount =new UserAccount(uname,pword);
	        context.addMessage(null, new FacesMessage("Successful",  "loginSuccess ") );
	        context.getExternalContext().getSessionMap().put("user",userAccount);
	        doRedirect("orderList.xhtml");
		}else {
			  context.addMessage(null, new FacesMessage("Unknown login, try again"));
	            uname = null;
	            pword = null;
	          
		}
		
	}
	
	
	  public String logout() {
		  isLogin=false;
	        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
	        return "index.xhtml?faces-redirect=true";
	    }
	  
	  
	  
	  
	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}

	/**
	 * @param uname
	 *            the uname to set
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
	 * @param pword
	 *            the pword to set
	 */
	public void setPword(String pword) {
		this.pword = pword;
	}

	/**
	 * @return the userAccount
	 */
	public UserAccount getUserAccount() {
		 FacesContext context = FacesContext.getCurrentInstance();
		    Map<String, Object> m = context.getExternalContext().getSessionMap();
		    userAccount= (UserAccount)m.get("user");
		return userAccount;
	}

}
