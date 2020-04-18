package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import service.TestService;


@ManagedBean(name = "testt")
@ViewScoped
public class TestController {

	@Inject
	TestService testService;

	public String display() {
		
		testService.show();
		 return "login.xhtml?faces-redirect=true"; 
	}

}
