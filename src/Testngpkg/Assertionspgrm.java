package Testngpkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionspgrm {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
	@Test
	public void titleverifcation()
	{
		String exp="facebook";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, exp);
		
		System.out.println("test1");
	}
	

}
