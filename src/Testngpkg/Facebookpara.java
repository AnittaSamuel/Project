package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebookpara {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Parameters({"username" , "password"})
	@Test
	public void facebook(String username, String password)
	{
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	}
	

}
