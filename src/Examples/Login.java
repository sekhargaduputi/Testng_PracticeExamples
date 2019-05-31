package Examples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Login {
	
	
	@Test(priority=1)
	public void setup(){
		System.out.println("setup");
		Reporter.log("setup");
	}
	@Test(priority=2)
	public void login(){
		System.out.println("login");
	}
	@Test
	public void logout(){
		System.out.println("logout");
		Reporter.log("logout");
	}

}
