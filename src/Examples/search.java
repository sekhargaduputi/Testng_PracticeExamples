package Examples;

import org.testng.annotations.Test;

public class search {
	
	@Test
	public void m(){
		System.out.println("m method");
	}
	@Test(dependsOnMethods="m")
	public void m1(){
		System.out.println("m1 method");
		
	}

}
