package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpathbooks {
	ChromeDriver driver;
	String baseurl="https://www.google.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test()
	{
		
		WebElement search =driver.findElement(By.name("q"));
		search.sendKeys("books",Keys.ENTER);
		//search.submit();
		
		//driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("books");
	}

}
