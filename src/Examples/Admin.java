package Examples;

import org.testng.annotations.Test;

public class Admin {
	
	@Test
	public void emp(){
		System.out.println("emp method");
	}
	@Test(dependsOnMethods="emp")
	public void emp1(){
		System.out.println("emp1 method");
	}

}
