package Testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrower {
	WebDriver driver;
	String baseurl="https://www.facebook.come";
	
	@Parameters({"browser"})
	@BeforeTest
	public void setUp(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			driver=new EdgeDriver();
		}
		
	}
	@Test
	public void test()
	{
		driver.get(baseurl);
	}

}
