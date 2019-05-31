package Examples;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\Testing Softwares\\Suresh Sir Selinum\\New Softwares&Jars\\Browser\\chromedriver 74 version.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		
		driver.findElement(By.xpath("//button[contains(text(),'Click to open a new browser window!')]")).click();
		System.out.println(driver.getTitle());
		String parentwindow=driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String>it=driver.getWindowHandles();
		
	/*	Iterator<String> s=it.iterator();
		
		String parent=	s.next();
		System.out.println(parent);
	
		String child=s.next();
		System.out.println(child);
	
	
		driver.switchTo().window(child);
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parent);*/
		
		
		for(String handle:it){
			if(!handle.equals(parentwindow)){
			System.out.println(handle);
			driver.switchTo().window(handle);
			String tittle=driver.getTitle();
			System.out.println(tittle);
			driver.get("https://www.flipkart.com");
			System.out.println(driver.getTitle());
			driver.close();
		}
	}	
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[contains(text(),'Alert Box')]")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.close();
		
	}
}
