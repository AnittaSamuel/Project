package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/upload/";
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
	@Test
	public void fileuploaded()
	{
		WebElement files=driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		
		
	}
	

}
